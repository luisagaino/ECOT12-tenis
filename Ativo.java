package br.edu.unifei.ecot12.esporte;

public class Ativo implements Estado {
	
	public void lesao(Jogador jogador) {
		jogador.setEstado(new Lesionado());
	}

}
