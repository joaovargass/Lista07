package ex01;

public abstract class Ser {
	private String sexo;
	private String nome;
	private String espécie;
	private String nascimento;
	private String planetaNatal;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEspécie() {
		return espécie;
	}
	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getPlanetaNatal() {
		return planetaNatal;
	}
	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
