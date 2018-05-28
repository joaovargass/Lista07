package ex01;

public class ChefeDeEstado extends Ser {
	private RegimePolítico regimePolítico;
	
	public ChefeDeEstado (String sexo,String nome, String espécie, String nascimento, String planetaNatal) {
		super (sexo, nome, espécie, nascimento, planetaNatal);
	}


	public RegimePolítico getRegimePolítico() {
		return regimePolítico;
	}

	public void setRegimePolítico(RegimePolítico regimePolítico) {
		this.regimePolítico = regimePolítico;
	}
	
	public void imprime () {
		System.out.println("	Nome: " + getNome());
		System.out.println("	Sexo: " + getSexo());
		System.out.println("	Espécie: " + getEspécie());
		System.out.println("	Nascimento: " + getNascimento());
		System.out.println("	Planeta Natal: " + getPlanetaNatal());
	}
}
