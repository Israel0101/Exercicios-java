package La�osCondicionais;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Insira o terceiro n�mero ");
		c = ler.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println(a+" � o n�mero maior.");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+" � o n�mero maior");
		}
		else if (c>a && c>b)
		{
			System.out.println(c+" � o n�mero maior");
		}
		else
		{
			System.out.println("N�o h� valor maior!");
		}
	}
}
