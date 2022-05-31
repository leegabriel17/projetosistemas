package br.edu.ifsp.arq.pss6.gerenciador_personagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
	
}
