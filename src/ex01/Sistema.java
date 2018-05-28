package ex01;

public class Sistema extends Planeta {
	private String sistema;
	
	public Sistema (String sistema, String nome, String c, int d) {
		super (nome, c, d);
		this.setSistema(sistema);
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	
	public void imprime () {
		System.out.println("	Sistema: " + sistema);
		System.out.println("	Planeta: " + getNome());
		System.out.println("	Cor: " + getCor());
		System.out.println("	Diâmetro: " + getDiâmetro() + " km");
	}
}
