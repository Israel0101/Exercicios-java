package POO_herança_polimorfismo;

public class animal {
	private String especie;
	private String nome;
	private int idade;
	private String som;
	private String acao;
	private String alimento;
	
	public animal(String especie,String nome, int idade, String som, String acao, String alimento)
	{
		this.especie = especie;
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
		this.alimento = alimento;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void imprima(){
	
		System.out.println("O animal é: "+getEspecie()+"\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nAção: "+getAcao()+"\nAlimento: "+getAlimento()+"\n");
	}
	
	

}
