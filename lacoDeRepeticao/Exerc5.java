package La�oDeRepeti��o;

import java.util.Scanner;

public class Exerc5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,soma=0;
		
		do 
		{
			System.out.println("Insira um n�mero: ");
			num=ler.nextInt();
			
				soma+=num;
			
		}while(num!=0);
		
		System.out.printf("A soma dos n�meros s�o %d",soma);
	}
}
