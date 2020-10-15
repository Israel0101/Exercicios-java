package POO;

public class cliente {
	public String nome;
	public String genero;
	
	public cliente (String nome, String genero)
	{
		this.nome = nome;
		this.genero = genero;
	}
	
	void darUmaOlhada () {
		System.out.printf("Só estou dando uma olhadinha!");
	}
	
	public static void main(String args[])
	{
		cliente shopping = new cliente("israel","masculino");
		System.out.println("o cliente é: "+shopping.nome+" / "+shopping.genero);
		System.out.println("\nDeseja comprar algo senhor?");
		shopping.darUmaOlhada();
	}
	
}
