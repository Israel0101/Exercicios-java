package POO_heran�a_polimorfismo;

public class testeAnimal {
	public static void main(String args[])
	{
		cachorro cachorro2 = new cachorro ("Cachorro","Thor",2,"AU,Au","Correr","Ra��o");
		cavalo cavalo2 = new cavalo ("Cavalo","Billi",4,"Irrirrirri","Correr","Feno");
		preguica preguica2 = new preguica ("Pregui�a","Genus",3,"Aaahhhh,","Sobe em �rvores","Folhas");
		
		cachorro2.imprima();
		cavalo2.imprima();
		preguica2.imprima();
	}

}
