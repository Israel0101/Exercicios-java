package LaçosCondicionais;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String args[])
	{
		double num,raiz,potencia;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um número inteiro: ");
		num = ler.nextDouble();
		
		if (num%2==0)
		{
			raiz=Math.sqrt(num);
			System.out.println("É par !");
			System.out.printf("A raiz é %.2f", raiz);
		}
		
		else
		{
			potencia =  Math.pow(num, 2 );
			System.out.println ( " O número é ímpar e sua raiz é: " + potencia);
		}
		
	}

}
