package br.edu.ifsp.arq.pss6.gerenciador_personagens.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.DTO.PersonagemDTO;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Personagem;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.repository.PersonagemRepository;


@Service
public class PersonagemService {

	@Autowired
	private PersonagemRepository PersonagemRepository;
	
	
	public Personagem atualizar(Long codigo, @Valid Personagem Personagem) {
		Personagem PersonagemSalva = buscapeloCod(codigo);
		BeanUtils.copyProperties(Personagem, PersonagemSalva,"codigo");//ele copia os dados e grava no objeto Personagem
		return PersonagemRepository.save(PersonagemSalva);
	}

	public void atualizarInv(Long codigo, PersonagemDTO Personagemdto) {
		Personagem Personagem = buscapeloCod(codigo);
		Personagem.setInventario(Personagemdto.getInventario());
		PersonagemRepository.save(Personagem);
	}
	private Personagem buscapeloCod(Long codigo) {
		Personagem PersonagemSalva = PersonagemRepository.findById(codigo).orElseThrow(()-> new  EmptyResultDataAccessException(1));
		return PersonagemSalva;
		
	}


	
}
