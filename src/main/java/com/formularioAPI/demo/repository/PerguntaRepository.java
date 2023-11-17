package com.formularioAPI.demo.repository;
import com.formularioAPI.demo.model.Pergunta;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

    List<Pergunta> findByvistoria(Integer vistoria);
}
