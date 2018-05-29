package ex01;

public class Youngling extends Jedi{
	private Mestre treinador;
	private boolean fezColheitaCristais;
	
	public boolean isFezColheitaCristais() {
		return fezColheitaCristais;
	}
	public void setFezColheitaCristais(boolean fezColheitaCristais) {
		this.fezColheitaCristais = fezColheitaCristais;
	}
	public Mestre getTreinador() {
		return treinador;
	}
	public void setTreinador(Mestre treinador) {
		this.treinador = treinador;
	}
}
