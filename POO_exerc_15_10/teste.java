package POO_exerc_15_10;

//public administrador(String nome, String endereco, String
		//cpf, int telefone, int idade, double ajudaDeCusto)

public class teste {
	public static void main(String args[]) {
		administrador adm = new administrador("Jose",null,null,977886655,43,4000);
		adm.gastoAjuda(1500);
		adm.imprimainf();
		
		System.out.println("============================================");
		
		vendedor vend = new vendedor("Paulo",null,null,965654343,30,0,40);
		vend.imprimainf();
		vend.somaVenda();
		vend.imprimainf();
		vend.porcentagem();
		vend.imprimainf();
	}
}
