package com.br.api.controller;

import com.br.api.assembler.AlunoAssembler;
import com.br.domain.model.Aluno;
import com.br.domain.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoRepository alunoRepository;
    private AlunoAssembler alunoAssembler;

    @GetMapping
    public List<Aluno> listar(){

        return alunoRepository.findAll();

    }

    @PostMapping("/cadastro")
    public Aluno cadastrar(@RequestBody Aluno aluno){
        Aluno newAluno = alunoAssembler.toEntity(aluno);
        aluno = alunoRepository.save(newAluno);

        return alunoAssembler.toModel(aluno);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Aluno> editar( @PathVariable Long id, @RequestBody Aluno aluno){

            aluno.setIdAluno(id);
            aluno.setNome(aluno.getNome());
            aluno = alunoRepository.save(aluno);

        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Aluno> remover(@PathVariable Long id){

        alunoRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
