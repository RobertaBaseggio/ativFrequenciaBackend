package com.br.api.controller;

import com.br.api.assembler.FrequenciaAssembler;
import com.br.domain.model.Frequencia;
import com.br.domain.repository.FrequenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/frequencia")
public class FrequenciaController {

    private FrequenciaRepository frequenciaRepository;
    private FrequenciaAssembler frequenciaAssembler;

    @GetMapping
    public List<Frequencia> listar(){

        return frequenciaAssembler.toCollectionModel(frequenciaRepository.findAll());

    }

    @PostMapping("/cadastro")
    public Frequencia cadastrar(@RequestBody Frequencia frequencia){
        Frequencia newFrequencia = frequenciaAssembler.toEntity(frequencia);
        frequencia = frequenciaRepository.save(newFrequencia);

        return frequenciaAssembler.toModel(frequencia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Frequencia> editar( @PathVariable Long id, @RequestBody Frequencia frequencia){

            frequencia.setFrequencia(frequencia.getFrequencia());
            frequencia = frequenciaRepository.save(frequencia);

        return ResponseEntity.ok(frequencia);
    }

}
