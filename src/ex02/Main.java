package ex02;

public class Main {

	public static void main(String[] args) {
		LordSith DarthVader = new LordSith("Darth Vader", 50, 10, 7);
		MestreJedi Yoda = new MestreJedi("Yoda", 55, 9, 8);
		Batalha batalha = new Batalha(DarthVader, Yoda);
		

	}

}
