package br.edu.unifei.ecot12.esporte;

public class Masters extends Torneio {

	public Masters(Quadra quadra) {
		super(quadra);
	}

	@Override
	public int pontuacao() {
		return 1000;
	}

}
