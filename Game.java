package br.edu.unifei.ecot12.esporte;

import java.util.ArrayList;
import java.util.List;

public class Game extends ElementoJogo {
	private boolean tiebreak;
	private List<Ponto> pontos = new ArrayList<Ponto>();

	public boolean isTiebreak() {
		return tiebreak;
	}
	public void setTiebreak(boolean tiebreak) {
		this.tiebreak = tiebreak;
	}
	public List<Ponto> getPontos() {
		return pontos;
	}
	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}
}
