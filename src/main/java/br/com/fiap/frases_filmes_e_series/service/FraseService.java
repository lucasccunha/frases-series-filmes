package br.com.fiap.frases_filmes_e_series.service;

import br.com.fiap.frases_filmes_e_series.dto.FraseDTO;
import br.com.fiap.frases_filmes_e_series.model.Frase;
import br.com.fiap.frases_filmes_e_series.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscaFrase();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(), frase.getPersonagem(),frase.getPoster());
    }
}
