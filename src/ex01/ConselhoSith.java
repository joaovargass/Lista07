package ex01;

public class ConselhoSith {
	private String nome;
	private Academia academia;
	private Sith[] administradores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sith[] getAdministradores() {
		return administradores;
	}
	public void setAdministradores(Sith[] administradores) {
		this.administradores = administradores;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
}
