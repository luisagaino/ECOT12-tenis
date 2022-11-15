package br.edu.unifei.ecot12.esporte;

import java.util.ArrayList;
import java.util.List;

public abstract class Torneio {
	private String nome;
	private String pais;
	private List<Match> matches = new ArrayList<Match>();
	private Jogador vencedor;
	private Quadra quadra;
	
	public Torneio(Quadra quadra) {
		this.quadra = quadra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	public Jogador getVencedor() {
		return vencedor;
	}
	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}
	public Quadra getQuadra() {
		return quadra;
	}
	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}
	
	public abstract int pontuacao();
	public double areaQuadra() {
		return quadra.linhaDeBase()*Quadra.tamanho;
	}
}
