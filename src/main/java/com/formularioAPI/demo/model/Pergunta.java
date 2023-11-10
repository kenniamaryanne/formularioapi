package com.formularioAPI.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("pergunta")
    private String pergunta;

    @JsonProperty("resposta")
    private String resposta;

    @JsonProperty("vistoria")
    private Long vistoria;

    // Getters e Setters
}
