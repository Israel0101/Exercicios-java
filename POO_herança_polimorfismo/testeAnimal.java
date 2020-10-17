package POO_herança_polimorfismo;

public class testeAnimal {
	public static void main(String args[])
	{
		cachorro cachorro2 = new cachorro ("Cachorro","Thor",2,"AU,Au","Correr","Ração");
		cavalo cavalo2 = new cavalo ("Cavalo","Billi",4,"Irrirrirri","Correr","Feno");
		preguica preguica2 = new preguica ("Preguiça","Genus",3,"Aaahhhh,","Sobe em árvores","Folhas");
		
		cachorro2.imprima();
		cavalo2.imprima();
		preguica2.imprima();
	}

}
