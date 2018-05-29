package ex02;

public class MestreJedi {
	private String nome;
	private int vida;
	private int domínioDaForça;
	private int domínioDoSabre;
	private Habilidades habilidade;
	
	public MestreJedi (String nome, int vida, int domínioDaForça, int domínioDoSabre) {
		this.domínioDaForça = domínioDaForça;
		this.domínioDoSabre = domínioDoSabre;
		this.nome = nome;
		this.vida = vida;
		habilidade.habilidades[0] = "Jedi atacou com sabre";
		habilidade.habilidades[1] = "Jedi atacou Forte com sabre";
		habilidade.habilidades[2] = "Jedi atacou com a Força";
		habilidade.habilidades[3] = "Jedi atacou Forte com a Força";
		habilidade.habilidades[4] = "Jedi se esquivou";
		habilidade.forçaDoAtaque[0] = 6;
		habilidade.forçaDoAtaque[1] = 9;
		habilidade.forçaDoAtaque[2] = 2;
		habilidade.forçaDoAtaque[3] = 3;
		habilidade.forçaDoAtaque[4] = 0;
		habilidade.prioridade[0] = 1;
		habilidade.prioridade[1] = 1;
		habilidade.prioridade[2] = 2;
		habilidade.prioridade[3] = 2;
		habilidade.prioridade[4] = 3;
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
