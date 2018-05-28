package ex01;

public class Main {

	public static void main(String[] args) {
		RegimePolítico RepúblicaGaláctica = new RegimePolítico("República Galáctica", "Coruscant", "19 ABY", "25.000 ABY");
		Planeta Coruscant = new Planeta();
		RepúblicaGaláctica.adicionarPlaneta();
	}

}
