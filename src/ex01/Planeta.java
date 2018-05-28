package ex01;

public class Planeta {
	
	private String nome;
	private String cor;
	private int diâmetro;
	private String sistema;
	
	public Planeta (String nome, String c, int d, String s) {
		cor = c;
		diâmetro = d;
		sistema = s;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getDiâmetro() {
		return diâmetro;
	}
	public void setDiâmetro(int diâmetro) {
		this.diâmetro = diâmetro;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
