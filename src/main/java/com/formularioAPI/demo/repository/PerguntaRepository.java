package com.formularioAPI.demo.repository;
import com.formularioAPI.demo.model.Pergunta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
}
