package com.formularioAPI.demo.service;

import com.formularioAPI.demo.repository.PerguntaRepository;
import com.formularioAPI.demo.model.Pergunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PerguntasService {

    @Autowired
    private PerguntaRepository perguntaRepository;


    public List<Pergunta> buscarPorVistoria(Integer codigoVistoria) {
        return perguntaRepository.findByvistoria(codigoVistoria);
    }



}
