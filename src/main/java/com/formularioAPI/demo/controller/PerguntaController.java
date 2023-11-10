package com.formularioAPI.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.formularioAPI.demo.model.Pergunta;
import com.formularioAPI.demo.repository.PerguntaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/pergunta")
public class PerguntaController {

    private final PerguntaRepository perguntaRepository;

    @Autowired
    public PerguntaController(PerguntaRepository perguntaRepository) {
        this.perguntaRepository = perguntaRepository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarPerguntas(@RequestBody List<Pergunta> perguntas) {
        // Salve as perguntas no banco de dados
        List<Pergunta> savedPerguntas = perguntaRepository.saveAll(perguntas);
        return ResponseEntity.ok(savedPerguntas);
    }
}
