package br.edu.unifei.ecot12.esporte;

import java.util.ArrayList;
import java.util.List;

public class Set extends ElementoJogo {
	private List<Game> games = new ArrayList<Game>();

	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
}
