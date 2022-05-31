package br.edu.ifsp.arq.pss6.gerenciador_personagens.config.token;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.security.AutorSistema;

public class CustomTokenEnhancer implements TokenEnhancer{

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		AutorSistema autorSistema = (AutorSistema)authentication.getPrincipal();
		
		Map<String, Object> addInfo = new HashMap<>();
		addInfo.put("nome", autorSistema.getUsuario().getNome());
		
		((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(addInfo);
		
		return accessToken;
	}

}