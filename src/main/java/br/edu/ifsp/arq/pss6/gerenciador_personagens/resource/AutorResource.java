package br.edu.ifsp.arq.pss6.gerenciador_personagens.resource;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Autor;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.repository.UsuarioRepository;


@RestController
@RequestMapping("/autor")
public class AutorResource {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/login")
	public ResponseEntity<Autor> buscarAutor(@PathVariable String email){
		Optional<Autor> Autor = usuarioRepository.findByEmail(email);
		if(Autor.isPresent()) {
			return ResponseEntity.ok(Autor.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA') and #oauth2.hasScope('write')")
	public Autor criar( @RequestBody Autor autor, HttpServletResponse response) {
		return usuarioRepository.save(autor);
	}
	
}
