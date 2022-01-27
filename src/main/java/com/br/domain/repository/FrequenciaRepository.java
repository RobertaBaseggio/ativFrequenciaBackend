package com.br.domain.repository;

import com.br.domain.model.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrequenciaRepository extends JpaRepository<Frequencia,Long> {

    List<Frequencia> findById(long id);
}
