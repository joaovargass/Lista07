package ex01;

public class Main {

	public static void main(String[] args) {
		ChefeDeEstado TarsusValorium = new ChefeDeEstado("Macho", "Tarsus Valorium", "Humano", "1.050 ABY", "Coruscant");
		RegimePolítico RepúblicaGaláctica = new RegimePolítico("República Galáctica", "Coruscant", "25.000 ABY", "19 ABY", TarsusValorium);
		TarsusValorium.setRegimePolítico(RepúblicaGaláctica);
		Sistema Shili = new Sistema("Sistema Shili", "Shili", "Azul", 23456);
		Sistema Coruscant = new Sistema("Sistema Coruscant", "Coruscant", "Metálica", 12240);
		RepúblicaGaláctica.addSistemas(Coruscant);
		RepúblicaGaláctica.addSistemas(Shili);
		RepúblicaGaláctica.imprime();
	}

}
