package br.com.fiap.frases_filmes_e_series.repository;

import br.com.fiap.frases_filmes_e_series.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
