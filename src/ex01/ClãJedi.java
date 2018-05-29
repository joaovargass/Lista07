package ex01;

public class ClãJedi {
	private String nome;
	private String dataDeFundação;
	private String dataDeExtinção;
	private Mestre treinador;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeFundação() {
		return dataDeFundação;
	}
	public void setDataDeFundação(String dataDeFundação) {
		this.dataDeFundação = dataDeFundação;
	}
	public String getDataDeExtinção() {
		return dataDeExtinção;
	}
	public void setDataDeExtinção(String dataDeExtinção) {
		this.dataDeExtinção = dataDeExtinção;
	}
	public Jedi getTreinador() {
		return treinador;
	}
	public void setTreinador(Mestre treinador) {
		this.treinador = treinador;
	}
	
}
