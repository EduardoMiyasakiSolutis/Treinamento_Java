package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.entity.Motorista;
import br.com.LocadoraVeiculo.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public ListagemMotoristaDTO saveMotorista(CadastroMotoristaDTO motoristaDTO) {
        var motorista = new Motorista(motoristaDTO);
        motoristaRepository.save(motorista);
        return toDTO(motorista);
    }

    public ListagemMotoristaDTO toDTO(Motorista motorista) {
        var listagemMotorista = new ListagemMotoristaDTO(motorista.getNome(), motorista.getCpf(), motorista.getEmail(), motorista.getNumeroCNH());
        return listagemMotorista;
    }

}
