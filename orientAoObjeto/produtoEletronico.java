package POO;

public class produtoEletronico {
	public String cor;
	public String tamanho;
	public double valor;
	
	public produtoEletronico () {
		this.cor = cor;
		this.tamanho = tamanho;
		this.valor = valor;
	}
	
	void ligar () {
		System.out.println("Welcome!");
	}
	void desligar() {
		System.out.println("Bye!");
	}
	
	public static void main(String args[]) {
		produtoEletronico videogame = new produtoEletronico();
		videogame.cor = "Preto e Branco";
		videogame.tamanho = "25 centímetros";
		videogame.valor = 6000;
		
		System.out.println("O videogame é: "+videogame.cor);
		System.out.println("Com o tamanho de: "+videogame.tamanho);
		System.out.println("No valor de: "+videogame.valor+ " reais.\n");
		 
		videogame.ligar();
		videogame.desligar();
	}
}
