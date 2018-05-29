package ex01;

public class Padawan extends Jedi {
	private boolean sabeConstruirSabre;
	private boolean possuiTrança;
	private String treinador;
	
	public boolean isSabeConstruirSabre() {
		return sabeConstruirSabre;
	}
	public void setSabeConstruirSabre(boolean sabeConstruirSabre) {
		this.sabeConstruirSabre = sabeConstruirSabre;
	}
	public boolean isPossuiTrança() {
		return possuiTrança;
	}
	public void setPossuiTrança(boolean possuiTrança) {
		this.possuiTrança = possuiTrança;
	}
	public String getTreinador() {
		return treinador;
	}
	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}
}
