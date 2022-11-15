package br.edu.unifei.ecot12.esporte;

import java.util.Date;

public class Lesionado implements Estado {
	private Date data;

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void lesao(Jogador jogador) {
		jogador.setEstado(new Ativo());
	}
}
