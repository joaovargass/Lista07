package ex01;

public class RegimePolítico {
	private String nome;
	private String capital;
	private Sistema[] sistemas = new Sistema[10];
	private String dataInstituição;
	private String dataDissolução;

	
	public RegimePolítico(String nome, String capital, String dataInstituição, String dataDissolução) {
		this.nome = nome;
		this.capital = capital;
		this.dataDissolução = dataDissolução;
		this.dataInstituição = dataInstituição;
		
	}
	
	int j = 0;
	public void addSistemas(Sistema s) {
		sistemas[j++] = s;
	}
	
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
	
	public void imprime () {
		System.out.println("Regime Político: " + nome);
		System.out.println("Capital: " + capital);
		System.out.println("Planetas: ");
		for (int k = 0; k < j; k++)
			sistemas[k].imprime();
		System.out.println("Data de Instituição: " + dataInstituição);
		System.out.println("Data de Dissolução: "+ dataDissolução);
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
}
