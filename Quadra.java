package br.edu.unifei.ecot12.esporte;

public abstract class Quadra {
	public static final double tamanho = 23.77;
	private QuadraEnum piso;
	
	public QuadraEnum getPiso() {
		return piso;
	}
	public void setPiso(QuadraEnum piso) {
		this.piso = piso;
	}

	public abstract double linhaDeBase();
}
