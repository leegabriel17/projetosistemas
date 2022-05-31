package br.edu.ifsp.arq.pss6.gerenciador_personagens.DTO;




import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Inventario;
import br.edu.ifsp.arq.pss6.gerenciador_personagens.model.Personagem;

public class PersonagemDTO {


	private long codigo;
	
	private Inventario Inventario;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	
	public Inventario getInventario() {
		return Inventario;
	}
	public void setInventario(Inventario Inventario) {
		this.Inventario = Inventario;
	}
	
	
	public PersonagemDTO() {
		super();
		
	}
	public PersonagemDTO(Personagem cli) {
		super();
		this.codigo = cli.getCodigo();
		this.Inventario = cli.getInventario();
	}
	
	
}
