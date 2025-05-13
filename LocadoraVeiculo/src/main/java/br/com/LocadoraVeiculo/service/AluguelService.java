package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.CadastroAluguelDTO;
import br.com.LocadoraVeiculo.dto.ListagemAluguelDTO;
import br.com.LocadoraVeiculo.entity.Aluguel;
import br.com.LocadoraVeiculo.mapper.AluguelMapper;
import br.com.LocadoraVeiculo.repository.AluguelRepository;
import br.com.LocadoraVeiculo.repository.CarroRepository;
import br.com.LocadoraVeiculo.tipos.Pagamento;
import br.com.LocadoraVeiculo.validacao.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.UUID;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private AluguelMapper aluguelMapper;

    public ListagemAluguelDTO saveAluguel(CadastroAluguelDTO aluguelDTO) {

//        if (!aluguelDTO.dataDevolucao().isAfter(aluguelDTO.dataEntrega())) {
//            throw new ValidacaoException("Data de devolução deve ser após a data de entrega");
//        }

        if(aluguelDTO.dataDevolucao().isBefore(aluguelDTO.dataEntrega())){
            throw new ValidacaoException("Data de devolução deve ser após a data de entrega");
        }

        var carro1 = carroRepository.findByPlaca(aluguelDTO.placa());

        long diasAluguel = ChronoUnit.DAYS.between(aluguelDTO.dataDevolucao(), aluguelDTO.dataEntrega());

        var aluguel = aluguelMapper.toEntity(aluguelDTO);
        aluguel.setCarro(carro1);
        aluguel.setDataDevolucao(aluguelDTO.dataDevolucao());
        aluguel.setDataEntrega(aluguelDTO.dataEntrega());
        aluguel.setValorTotal(BigDecimal.valueOf(diasAluguel).multiply(carro1.getValorDiaria()));
        aluguel.setDataPedido(Calendar.getInstance());
        aluguel.setPagamento(Pagamento.fromString(aluguelDTO.metodoPagamento()));
        aluguel.setCarrinho(true);
        aluguelRepository.save(aluguel);

        return aluguelMapper.toListagemAluguelDTO(aluguel);
    }

    public ListagemAluguelDTO atualizarBooleanCarrinho(UUID idAluguel) {
        Aluguel aluguel = aluguelRepository.findById(idAluguel)
                .orElseThrow(() -> new RuntimeException("Aluguel não encontrado"));

        aluguel.setCarrinho(false);

        aluguelRepository.save(aluguel);

        return aluguelMapper.toListagemAluguelDTO(aluguel);
    }
}