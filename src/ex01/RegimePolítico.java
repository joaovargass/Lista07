package ex01;

public class RegimePolítico {
	private String nome;
	private String capital;
	private Sistema[] sistemas = new Sistema[10];
	private String dataInstituição;
	private String dataDissolução;
	private String chefeDeEstado;

	
	public String getDataDissolução() {
		return dataDissolução;
	}
	public void setDataDissolução(String dataDissolução) {
		this.dataDissolução = dataDissolução;
	}
	

	public String getDataInstituição() {
		return dataInstituição;
	}
	public void setDataInstituição(String dataInstituição) {
		this.dataInstituição = dataInstituição;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sistema[] getSistemas() {
		return sistemas;
	}
	public void setSistemas(Sistema[] sistemas) {
		this.sistemas = sistemas;
	}
	public String getChefeDeEstado() {
		return chefeDeEstado;
	}
	public void setChefeDeEstado(String chefeDeEstado) {
		this.chefeDeEstado = chefeDeEstado;
	}



}
