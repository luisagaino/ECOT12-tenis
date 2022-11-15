package br.edu.unifei.ecot12.esporte;

public class Saque {
	private LadoEnum lado;
	private float velocidade;
	private SaqueEnum tipo;
	
	public LadoEnum getLado() {
		return lado;
	}
	public void setLado(LadoEnum lado) {
		this.lado = lado;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public SaqueEnum getTipo() {
		return tipo;
	}
	public void setTipo(SaqueEnum tipo) {
		this.tipo = tipo;
	}
}
