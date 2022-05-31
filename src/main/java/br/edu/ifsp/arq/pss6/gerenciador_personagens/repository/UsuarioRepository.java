package br.edu.ifsp.arq.pss6.gerenciador_personagens.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Autor;

public interface UsuarioRepository extends JpaRepository<Autor, Long>{
	
	public Optional<Autor> findByEmail(String email);
	
}
