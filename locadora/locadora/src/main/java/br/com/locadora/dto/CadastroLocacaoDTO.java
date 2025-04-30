package br.com.locadora.dto;

import br.com.locadora.entity.Cliente;
import jakarta.validation.constraints.NotBlank;

public record CadastroLocacaoDTO(@NotBlank String nomeCliente, @NotBlank String nomeFilme) {
}
