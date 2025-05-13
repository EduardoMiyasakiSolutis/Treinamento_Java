package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.tipos.Pagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAluguel;

    private Calendar dataPedido;

    private LocalDate dataEntrega;

    private LocalDate dataDevolucao;

    private BigDecimal valorTotal;

    private boolean carrinho;

    @Enumerated(EnumType.STRING)
    private Pagamento pagamento;

    @ManyToOne
    private Motorista motorista;

    @OneToOne
    private ApoliceSeguro apoliceSeguro;

    @ManyToOne
    private Carro carro;

}
