package br.edu.ifsp.arq.pss6.gerenciador_personagens.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Autor;

public class AutorSistema extends User{
	private static final long serialVersionUID = 1L;
	
	private Autor autor;

	public AutorSistema(Autor autor, Collection<? extends GrantedAuthority> authorities) {
		super(autor.getEmail(), autor.getSenha(), authorities);
		this.autor = autor;
	}
	
	public Autor getUsuario() {
		return autor;
	}
}
