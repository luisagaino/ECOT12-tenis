package br.edu.unifei.ecot12.esporte;

import java.util.List;
import java.util.ArrayList;

public class Ponto extends ElementoJogo {
	private boolean winner;
	private Saque saque;
	private List<Golpe> golpes = new ArrayList<Golpe>();
	
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	public Saque getSaque() {
		return saque;
	}
	public void setSaque(Saque saque) {
		this.saque = saque;
	}
	public List<Golpe> getGolpes() {
		return golpes;
	}
	public void setGolpes(List<Golpe> golpes) {
		this.golpes = golpes;
	}
}
