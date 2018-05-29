package ex02;

public class Main {

	public static void main(String[] args) {
		LordSith DarthVader = new LordSith("Darth Vader", 50);
		MestreJedi Yoda = new MestreJedi("Yoda", 55);
		Batalha batalha1 = new Batalha(DarthVader, Yoda);
		batalha1.começa();
		
		System.out.println("*******************************************");
		
		LordSith DarthSidious = new LordSith("Darth Sidious", 150, 5, 3);
		MestreJedi AhsokaTano = new MestreJedi("Ahsoka Tano", 160, 6, 2);
		Batalha batalha2 = new Batalha(DarthSidious, AhsokaTano);
		batalha2.começa();

	}

}
