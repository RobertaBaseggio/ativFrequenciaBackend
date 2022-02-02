package com.br.domain.repository;

import com.br.domain.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

    List<Aluno> findByIdAluno(int id);

}
