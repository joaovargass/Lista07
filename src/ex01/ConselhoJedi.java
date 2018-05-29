package ex01;

public class ConselhoJedi {
	private String nome;
	private Jedi[] administradores = new Jedi[10];
	private Academia academia;
	
	public Jedi[] getAdministradores() {
		return administradores;
	}
	public void setAdministradores(Jedi[] administradores) {
		this.administradores = administradores;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
