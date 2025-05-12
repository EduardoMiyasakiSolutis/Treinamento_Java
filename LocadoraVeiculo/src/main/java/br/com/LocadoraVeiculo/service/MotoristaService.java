package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.repository.MotoristaRepository;
import br.com.LocadoraVeiculo.mapper.MotoristaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private MotoristaMapper motoristaMapper;

    public void saveMotorista(CadastroMotoristaDTO motoristaDTO) {

        if (motoristaRepository.existsByEmail(motoristaDTO.email())) {
            throw new RuntimeException("Email já existe");
        }

        var motorista = motoristaMapper.toEntity(motoristaDTO);
        motoristaRepository.save(motorista);
    }

}
