package br.edu.unifei.ecot12.esporte;

public class Bola {
	private float diametro;	// entre 6.35 e 6.67
	private float peso;		// entre 56.7 e 58.5
	private Marca marca;
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}
