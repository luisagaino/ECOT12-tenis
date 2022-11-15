package br.edu.unifei.ecot12.esporte;

import java.util.Calendar;

public class Jogador {
	private String nome;
	private String nacionalidade;
	private String genero;
	private Calendar nascimento;
	private LadoEnum maoDominante;
	private Ranking ranking;
	private Marca patrocinador;
	private Estado estado = new Ativo();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public LadoEnum getMaoDominante() {
		return maoDominante;
	}
	public void setMaoDominante(LadoEnum maoDominante) {
		this.maoDominante = maoDominante;
	}
	public Ranking getRanking() {
		return ranking;
	}
	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
	public Marca getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Marca patrocinador) {
		this.patrocinador = patrocinador;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void lesionar() {
		estado.lesao(this);
	}
}
