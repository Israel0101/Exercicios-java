package POO_exerc_15_10;

public class administrador extends pessoa {
	private double ajudaDeCusto;
	
	public administrador(String nome, String endereco, String
			cpf, int telefone, int idade, double ajudaDeCusto)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void gastoAjuda(double valor){
		
		ajudaDeCusto -= valor;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void imprimainf() {
		System.out.printf("Nome do administrador: %s",getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Saldo da ajuda de custo no valor de: "+ajudaDeCusto);
		
	}


}
