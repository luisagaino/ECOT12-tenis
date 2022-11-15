package br.edu.unifei.ecot12.esporte;

public abstract class ElementoJogo {
	private Jogador vencedor;
	private Jogador perdedor;
	
	public Jogador getVencedor() {
		return vencedor;
	}
	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}
	public Jogador getPerdedor() {
		return perdedor;
	}
	public void setPerdedor(Jogador perdedor) {
		this.perdedor = perdedor;
	}
}
