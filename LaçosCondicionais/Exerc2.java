package LaçosCondicionais;

import java.util.*;

public class Exerc2 {
	public static void main(String orgs[])
	{
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com 3 números de sua escolha: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if (c>a)
		/*{
			if (a>b)
			{
				System.out.printf("A ordem crescente: %d %d %d",b,a,c);
			}
			else if (b<c)
			{
				System.out.printf("A ordem crescente: %d %d %d",a,b,c);
			}
		}*/
		
		
		if (a<b && b<c)
			{
				System.out.printf("Ordem: %d %d %d",a,b,c);
			}
		
		if (a<c && c<b)
			{
				System.out.printf("Ordem: %d %d %d",a,c,b);
			}
		
		if (b<a && a<c)
			{
				System.out.printf("Ordem: %d %d %d", b,a,c);
			}
		
		if (b<c && c<a)
			{
				System.out.printf("Ordem: %d %d %d", b,c,a);
			}
		
		if (c<b && b<a)
			{
				System.out.printf("Ordem: %d %d %d",c,b,a);
			}
		
		if (c<a && a<b)
			{
				System.out.printf("Ordem: %d %d %d",c,a,b);
			}
		
	}
}
