package br.edu.ifsp.arq.pss6.gerenciador_personagens.model;

import javax.persistence.Embeddable;

@Embeddable
public class Inventario {
	
	private String bebiveis;
	private String alimentos;
	private String conhecimento;
	private String medicinais;
	private String armas;
	
	public String getBebiveis() {
		return bebiveis;
	}
	public void setBebiveis(String bebiveis) {
		this.bebiveis = bebiveis;
	}
	public String getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}
	public String getConhecimento() {
		return conhecimento;
	}
	public void setConhecimento(String conhecimento) {
		this.conhecimento = conhecimento;
	}
	public String getMedicinais() {
		return medicinais;
	}
	public void setMedicinais(String medicinais) {
		this.medicinais = medicinais;
	}
	public String getArmas() {
		return armas;
	}
	public void setArmas(String armas) {
		this.armas = armas;
	}
	
	
}
