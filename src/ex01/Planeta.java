package ex01;

public abstract class Planeta {
	
	private String nome;
	private String cor;
	private int diâmetro;
	
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


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
