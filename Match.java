package br.edu.unifei.ecot12.esporte;

import java.util.List;
import java.util.ArrayList;

public class Match extends ElementoJogo {
	private boolean dupla;
	private List<Set> sets = new ArrayList<Set>();

	public boolean isDupla() {
		return dupla;
	}
	public void setDupla(boolean dupla) {
		this.dupla = dupla;
	}
	public List<Set> getSets() {
		return sets;
	}
	public void setSets(List<Set> sets) {
		this.sets = sets;
	}
}
