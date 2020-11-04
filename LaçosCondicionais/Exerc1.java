package LaçosCondicionais;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Insira o segundo número: ");
		b = ler.nextInt();
		System.out.println("Insira o terceiro número ");
		c = ler.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println(a+" É o número maior.");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+" É o número maior");
		}
		else if (c>a && c>b)
		{
			System.out.println(c+" É o número maior");
		}
		else
		{
			System.out.println("Não há valor maior!");
		}
	}
}
