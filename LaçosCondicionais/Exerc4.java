package La�osCondicionais;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String args[])
	{
		double num,raiz,potencia;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um n�mero inteiro: ");
		num = ler.nextDouble();
		
		if (num%2==0)
		{
			raiz=Math.sqrt(num);
			System.out.println("� par !");
			System.out.printf("A raiz � %.2f", raiz);
		}
		
		else
		{
			potencia =  Math.pow(num, 2 );
			System.out.println ( " O n�mero � �mpar e sua raiz �: " + potencia);
		}
		
	}

}
