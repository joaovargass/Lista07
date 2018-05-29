package ex01;

public class Missão {
	private String nome;
	private String data;
	private String objetivo;
	private String líder;
	private Sistema[] sistemas;
	private String[] seresEnvolvidos;
	private boolean sucesso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getLíder() {
		return líder;
	}
	public void setLíder(String líder) {
		this.líder = líder;
	}
	public Sistema[] getSistemas() {
		return sistemas;
	}
	public void setSistemas(Sistema[] sistemas) {
		this.sistemas = sistemas;
	}
	public String[] getSeresEnvolvidos() {
		return seresEnvolvidos;
	}
	public void setSeresEnvolvidos(String[] seresEnvolvidos) {
		this.seresEnvolvidos = seresEnvolvidos;
	}
	public boolean isSucesso() {
		return sucesso;
	}
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
	
}
