package com.formularioAPI.demo.controller;

import com.formularioAPI.demo.controller.PerguntaController;
import com.formularioAPI.demo.service.PerguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.formularioAPI.demo.model.Pergunta;
import com.formularioAPI.demo.repository.PerguntaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/pergunta")
public class PerguntaController {

    @Autowired
    PerguntaRepository perguntaRepository;

    @Autowired
    PerguntasService perguntasService;



    @PostMapping("/salvar")
    public ResponseEntity<?> salvarPerguntas(@RequestBody List<Pergunta> perguntas) {
        // Salve as perguntas no banco de dados
        List<Pergunta> savedPerguntas = perguntaRepository.saveAll(perguntas);
        return ResponseEntity.ok(savedPerguntas);
    }

    @GetMapping("/buscar/{codigoVistoria}")
    public ResponseEntity<List<Pergunta>> buscarPorVistoria(@PathVariable Integer codigoVistoria) {
        List<Pergunta> fotos = perguntasService.buscarPorVistoria(codigoVistoria);
        return ResponseEntity.ok(fotos);
    }



}
