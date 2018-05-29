package ex02;

import java.util.Random;

public class Batalha {
	Random aleatorio  = new Random();
	private LordSith lord;
	private MestreJedi mestre;
	
	public Batalha (LordSith l, MestreJedi m) {
		setLord(l);
		setMestre(m);
	}
	
	public void começa() {
		int L, M;
		int i = 0;
		System.out.println("COMEÇOU A BATALHA!!!");
		while (lord.getVida() > 0 && mestre.getVida() > 0) {
			i++;
			System.out.println(i + "a rodada!");
			L = aleatorio.nextInt(5);
			M = aleatorio.nextInt(5);
			if (lord.prioridade[L] > mestre.prioridade[M]) {
				if (lord.tipoDeHabilidade[L] == 'e' && mestre.tipoDeHabilidade[M] == 'f'){
					lord.setVida(lord.getVida() - mestre.forçaDoAtaque[M]);
					System.out.println(lord.habilidades[L]);
					System.out.println("Porém... " + mestre.habilidades[M]);
				}
				if (lord.tipoDeHabilidade[L] == 'e' && mestre.tipoDeHabilidade[M] == 's'){
					System.out.println(mestre.habilidades[M]);
					System.out.println("Porém... " + lord.habilidades[L]);
				}
			}
		
			if (lord.prioridade[L] < mestre.prioridade[M]) {
				if (lord.tipoDeHabilidade[L] == 'f' && mestre.tipoDeHabilidade[M] == 'e'){
					mestre.setVida(mestre.getVida() - lord.forçaDoAtaque[L]);
					System.out.println(mestre.habilidades[M]);
					System.out.println("Porém... " + lord.habilidades[L]);
				}
				if (lord.tipoDeHabilidade[L] == 's' && mestre.tipoDeHabilidade[M] == 'e'){
					System.out.println(lord.habilidades[L]);
					System.out.println("Porém... " + mestre.habilidades[M]);
				}
			}
			System.out.println("Vida do Lord Sith: " + lord.getVida() + " || Vida do Mestre Jedi: " + mestre.getVida());
		}
		if (lord.getVida() <= 0)
			System.out.println("Mestre Jedi ganhou a batalha!");
		else
			System.out.println("Lord Sith ganhou a batalha!");
	}

	public LordSith getLord() {
		return lord;
	}

	public void setLord(LordSith lord) {
		this.lord = lord;
	}

	public MestreJedi getMestre() {
		return mestre;
	}

	public void setMestre(MestreJedi mestre) {
		this.mestre = mestre;
	}
}
