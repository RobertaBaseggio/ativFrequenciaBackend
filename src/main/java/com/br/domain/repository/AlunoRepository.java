package com.br.domain.repository;

import com.br.domain.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

    Aluno findByIdAluno(Long id);
}
