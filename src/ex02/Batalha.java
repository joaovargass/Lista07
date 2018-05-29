package ex02;

public class Batalha {
	private LordSith lord;
	private MestreJedi mestre;
	
	public Batalha (LordSith l, MestreJedi m) {
		setLord(l);
		setMestre(m);
	}
	
	public void comecar () {
		
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
