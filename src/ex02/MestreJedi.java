package ex02;

public class MestreJedi {
	private String nome;
	private int vida;
	private int domínioDaForça;
	private int domínioDoSabre;
	
	public MestreJedi (String nome, int vida, int domínioDaForça, int domínioDoSabre) {
		this.domínioDaForça = domínioDaForça;
		this.domínioDoSabre = domínioDoSabre;
		this.nome = nome;
		this.vida = vida;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDomínioDaForça() {
		return domínioDaForça;
	}

	public void setDomínioDaForça(int domínioDaForça) {
		this.domínioDaForça = domínioDaForça;
	}

	public int getDomínioDoSabre() {
		return domínioDoSabre;
	}

	public void setDomínioDoSabre(int domínioDoSabre) {
		this.domínioDoSabre = domínioDoSabre;
	}

	public int atacarComSabre (int numero) {
		if (numero == 0)
			return 7;
		else
			return -1;
	}
	
	public int atacarForteComSabre (int numero) {
		if (numero == 1)
			return 9;
		else
			return -1;
	}
	
	public int atacarComForça (int numero) {
		if (numero == 2)
			return 1;
		else
			return -1;
	}
	
	public int atacarForteComForça (int numero) {
		if (numero == 3)
			return 3;
		else
			return -1;
	}
	
	public int esquivar (int numero) {
		if (numero == 4)
			return 0;
		else
			return -1;
	}
}
