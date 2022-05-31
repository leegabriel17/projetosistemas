package br.edu.ifsp.arq.pss6.gerenciador_personagens.resource;


import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.DTO.PersonagemDTO;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Personagem;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.repository.PersonagemRepository;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.service.PersonagemService;

@RestController
@RequestMapping("/personagem")
public class PersonagemResource {
	
	@Autowired
	private PersonagemRepository PersonagemRepository;
	
	@Autowired
	private PersonagemService PersonagemService;
	

	
	@GetMapping
	public List<Personagem> listar(){
		return PersonagemRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA') and #oauth2.hasScope('write')")
	public Personagem criar(@Valid @RequestBody Personagem Personagem, HttpServletResponse response) {
		return PersonagemRepository.save(Personagem);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Personagem> buscarPeloCodigo(@PathVariable Long codigo){
		Optional<Personagem> Personagem = PersonagemRepository.findById(codigo);
		if(Personagem.isPresent()) {
			return ResponseEntity.ok(Personagem.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/remover/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	//@PreAuthorize("hasAuthority('ROLE_REMOVER_PESSOA') and #oauth2.hasScope('write')")
	public void remover(@PathVariable Long codigo) {
		PersonagemRepository.deleteById(codigo);	
	}
	
	@PutMapping("/{codigo}")
	//@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA') and #oauth2.hasScope('write')")
	public ResponseEntity<Personagem> atualizar(@PathVariable Long codigo,@Valid @RequestBody Personagem Personagem){
		Personagem PersonagemSalva = PersonagemService.atualizar(codigo,Personagem);
		return ResponseEntity.ok(PersonagemSalva);
	}
	
	@PutMapping("/{codigo}/inventario")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	//@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA') and #oauth2.hasScope('write')")
	public void atualizarEnd(@PathVariable Long codigo,@RequestBody PersonagemDTO PersonagemDTO){
		 PersonagemService.atualizarInv(codigo,PersonagemDTO);
		
	}
	
}