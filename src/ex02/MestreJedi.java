package ex02;

public class MestreJedi {
	private String nome;
	private int vida;
	private int domínioDaForça = 1;
	private int domínioDoSabre = 1;

	public String[] habilidades = new String[5];
	public int[] forçaDoAtaque = new int[5];
	public int[] prioridade = new int[5];
	public char[] tipoDeHabilidade = new char[5];
	
	public MestreJedi (String nome, int vida, int domínioDaForça, int domínioDoSabre) {
		this.domínioDaForça = domínioDaForça;
		this.domínioDoSabre = domínioDoSabre;
		this.nome = nome;
		this.vida = vida;
		iniciarHabilidades();
	}
	
	public MestreJedi (String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
		iniciarHabilidades();
	}
	
	public void iniciarHabilidades() {
		habilidades[0] = "Mestre Jedi atacou com sabre";
		habilidades[1] = "Mestre Jedi atacou Forte com sabre";
		habilidades[2] = "Mestre Jedi atacou com a Força";
		habilidades[3] = "Mestre Jedi atacou Forte com a Força";
		habilidades[4] = "Mestre Jedi se esquivou";
		forçaDoAtaque[0] = 6*domínioDoSabre;
		forçaDoAtaque[1] = 9*domínioDoSabre;
		forçaDoAtaque[2] = 2*domínioDaForça;
		forçaDoAtaque[3] = 3*domínioDaForça;
		forçaDoAtaque[4] = 0;
		prioridade[0] = 1;
		prioridade[1] = 1;
		prioridade[2] = 2;
		prioridade[3] = 2;
		prioridade[4] = 3;
		tipoDeHabilidade[0] = 's';
		tipoDeHabilidade[1] = 's';
		tipoDeHabilidade[2] = 'f';
		tipoDeHabilidade[3] = 'f';
		tipoDeHabilidade[4] = 'e';
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

	
}
