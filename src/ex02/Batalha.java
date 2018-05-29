package ex02;

import java.util.Random;

public class Batalha {
	Random aleatorio  = new Random();
	private LordSith lord;
	private MestreJedi mestre;
	
	public Batalha (LordSith l, MestreJedi m) {
		setLord(l);
		setMestre(m);
		int L, M;
		while (lord.getVida() > 0 && mestre.getVida() > 0) {
			L = aleatorio.nextInt(5);
			M = aleatorio.nextInt(5);
			
		}
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
