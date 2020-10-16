package POO_exerc_15_10;

import java.util.*;

public class vendedor extends pessoa {
	private double valorVenda;
	private double comissao;
	double valorReceber,valor;
	Scanner ler= new Scanner(System.in);
	
	public vendedor (String nome, String endereco, String
			cpf, int telefone, int idade, double valorVenda, double comissao) {
		
		super(nome,endereco,cpf,telefone,idade);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}
		

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double somaVenda() {
	do {
		
		System.out.println("Insira o valor do produto: ");
		valor = ler.nextDouble();
		valorVenda=valorVenda+valor;
	}while (valor>0);
	return valor;
	}
		
	public void porcentagem() {
	valorReceber = (valorVenda*comissao)/100;
		
	}
	
	public void imprimainf() {
		System.out.printf("Nome do administrador: %s",getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("A soma de todas as vendas é: "+valorVenda);
		System.out.println("Valor da comissão: "+valorReceber);
	}
}
