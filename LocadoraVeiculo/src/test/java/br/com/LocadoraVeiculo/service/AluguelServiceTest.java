package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.CadastroAluguelDTO;
import br.com.LocadoraVeiculo.dto.ListagemAluguelDTO;
import br.com.LocadoraVeiculo.entity.Aluguel;
import br.com.LocadoraVeiculo.entity.ApoliceSeguro;
import br.com.LocadoraVeiculo.entity.Carro;
import br.com.LocadoraVeiculo.entity.Motorista;
import br.com.LocadoraVeiculo.mapper.AluguelMapper;
import br.com.LocadoraVeiculo.repository.AluguelRepository;
import br.com.LocadoraVeiculo.repository.CarroRepository;
import br.com.LocadoraVeiculo.tipos.Pagamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AluguelServiceTest {

    @InjectMocks
    private AluguelService aluguelService;

    @Mock
    private AluguelRepository aluguelRepository;

    @Mock
    private CarroRepository carroRepository;

    @Mock
    private AluguelMapper aluguelMapper;

    private Carro carro;
    private Aluguel aluguel;
    private CadastroAluguelDTO cadastroAluguelDTO;

    @BeforeEach
    void configurando() {
        carro = new Carro();
        carro.setPlaca("ABC1A23");
        carro.setValorDiaria(new BigDecimal("100.00"));

        aluguel = new Aluguel();
        aluguel.setIdAluguel(UUID.fromString("123e4567-e89b-12d3-a456-426614174000"));

        cadastroAluguelDTO = new CadastroAluguelDTO(
                LocalDate.of(2025, 5, 10),
                LocalDate.of(2025, 5, 11),
                "ABC1A23",
                "CREDITO"
        );
    }

    @Test
    void saveAluguel() {
        // ARRANGE
        when(carroRepository.findByPlaca("ABC1A23")).thenReturn(carro);
        when(aluguelMapper.toEntity(cadastroAluguelDTO)).thenReturn(aluguel);

        // ACT
        aluguelService.saveAluguel(cadastroAluguelDTO);

        // ASSERT
        verify(aluguelRepository).save(aluguel);
        assertEquals(UUID.fromString("123e4567-e89b-12d3-a456-426614174000"), aluguel.getIdAluguel());
    }
}
