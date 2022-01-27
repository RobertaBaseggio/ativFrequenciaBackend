package com.br.api.assembler;

import com.br.domain.model.Aluno;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AlunoAssembler {

    private ModelMapper modelMapper;

    public Aluno toModel(Aluno aluno){
        return modelMapper.map(aluno, Aluno.class);
    }

    public List<Aluno> toCollectionModel(List<Aluno> alunos){
        return alunos.stream().map(this::toModel).collect(Collectors.toList());
    }


    public Aluno toEntity(Aluno aluno){

        return modelMapper.map(aluno, Aluno.class);
    }
}