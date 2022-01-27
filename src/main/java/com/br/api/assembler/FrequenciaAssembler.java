package com.br.api.assembler;

import com.br.domain.model.Frequencia;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class FrequenciaAssembler {

    private ModelMapper modelMapper;

    public Frequencia toModel(Frequencia frequencia){
        return modelMapper.map(frequencia, Frequencia.class);
    }

    public List<Frequencia> toCollectionModel(List<Frequencia> frequencias){
        return frequencias.stream().map(this::toModel).collect(Collectors.toList());
    }


    public Frequencia toEntity(Frequencia frequencia){

        return modelMapper.map(frequencia, Frequencia.class);
    }
}