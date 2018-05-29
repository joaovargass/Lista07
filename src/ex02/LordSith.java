package ex02;

public class LordSith {
	private String nome;
	private int vida;
	private int domínioDaForça;
	private int domínioDoSabre;
	private Habilidades habilidade;

	
	
	public LordSith (String nome, int vida, int domínioDaForça, int domínioDoSabre) {
		this.domínioDaForça = domínioDaForça;
		this.domínioDoSabre = domínioDoSabre;
		this.nome = nome;
		this.vida = vida;
		habilidade.habilidades[0] = "Lorde atacou com sabre";
		habilidade.habilidades[1] = "Lorde atacou Forte com sabre";
		habilidade.habilidades[2] = "Lorde atacou com a Força";
		habilidade.habilidades[3] = "Lorde atacou Forte com a Força";
		habilidade.habilidades[4] = "Lorde se esquivou";
		habilidade.forçaDoAtaque[0] = 5;
		habilidade.forçaDoAtaque[1] = 10;
		habilidade.forçaDoAtaque[2] = 1;
		habilidade.forçaDoAtaque[3] = 4;
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
