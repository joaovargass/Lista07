package ex01;

public class Jedi extends Ser {
	private String treinador;
	private int percentualPazInterna;
	private String poderes;
	
	
	public Jedi(String sexo, String nome, String espécie, String nascimento, String planetaNatal) {
		super(sexo, nome, espécie, nascimento, planetaNatal);
	}

	public int getPercentualPazInterna() {
		return percentualPazInterna;
	}


	public void setPercentualPazInterna(int percentualPazInterna) {
		this.percentualPazInterna = percentualPazInterna;
	}


	public String getPoderes() {
		return poderes;
	}


	public void setPoderes(String poderes) {
		this.poderes = poderes;
	}


	public String getTreinador() {
		return treinador;
	}


	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}
	
}
