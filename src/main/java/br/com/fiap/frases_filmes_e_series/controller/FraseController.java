package br.com.fiap.frases_filmes_e_series.controller;

import br.com.fiap.frases_filmes_e_series.dto.FraseDTO;
import br.com.fiap.frases_filmes_e_series.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }
}
