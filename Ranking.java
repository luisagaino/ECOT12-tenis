package br.edu.unifei.ecot12.esporte;

public class Ranking {
	private int posicao;
	private int pontuacao;
	private Jogador jogador;
	private Ranking sucessor;
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Ranking getSucessor() {
		return sucessor;
	}
	public void setSucessor(Ranking sucessor) {
		this.sucessor = sucessor;
	}
}
