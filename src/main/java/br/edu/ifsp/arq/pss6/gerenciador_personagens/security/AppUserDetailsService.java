package br.edu.ifsp.arq.pss6.gerenciador_personagens.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Autor;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.repository.UsuarioRepository;


@Service
public class AppUserDetailsService implements UserDetailsService{



	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Autor> usuarioOptional = usuarioRepository.findByEmail(email);
		Autor autor = usuarioOptional.orElseThrow(
				() -> new UsernameNotFoundException("Autor e/ou senha incorretos"));
		return new AutorSistema(autor, getPermissoes(autor));
	}

	private Collection<? extends GrantedAuthority> getPermissoes(Autor autor) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		autor.getPermissoes().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescricao().toUpperCase())));
		return authorities;
	}
}