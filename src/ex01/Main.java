package ex01;

public class Main {

	public static void main(String[] args) {
		RegimePolítico RepúblicaGaláctica = new RegimePolítico("República Galáctica", "Coruscant", "25.000 ABY", "19 ABY");
		Sistema Shili = new Sistema("Sistema Shili", "Shili", "Azul", 23456);
		Sistema Coruscant = new Sistema("Sistema Coruscant", "Coruscant", "Metálica", 12240);
		RepúblicaGaláctica.addSistemas(Coruscant);
		RepúblicaGaláctica.addSistemas(Shili);
		RepúblicaGaláctica.imprime();
	}

}
