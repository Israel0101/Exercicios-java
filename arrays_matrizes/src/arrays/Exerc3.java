package arrays;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int linha,coluna,cont=0;
		int [] [] mat = new int [3] [3];
		
		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o elemento M: [%d] [%d]",linha+1,coluna+1);
				mat [linha] [coluna] =ler.nextInt();
				
				if (mat [linha] [coluna]>10)
					{
						cont++;
					}
			}
		}
		
			System.out.println("\nExistem: "+cont+" valores maiores que dez.");
	}
}
