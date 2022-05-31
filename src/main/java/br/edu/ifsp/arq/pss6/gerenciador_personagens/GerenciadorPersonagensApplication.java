package br.edu.ifsp.arq.pss6.gerenciador_personagens;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.edu.ifsp.arq.pss6.gerenciador_personagens.config.property.FinanceiroApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinanceiroApiProperty.class)
public class GerenciadorPersonagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPersonagensApplication.class, args);
	}

}
