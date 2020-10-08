package LaçoDeRepetição;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade,contUm=0,contDois=0;
		
		System.out.println("insira sua idade: ");
		idade=ler.nextInt();
		while (idade!=-99)
		{
			System.out.println("insira sua idade: ");
			idade=ler.nextInt();
			
			if (idade<=21)
			{
				contUm++;
			}
			
			else if (idade>=50)
			{
				contDois++;
			}
			
		}
		
			System.out.println("Total de pessoas com menos de 21: "+contUm);
			System.out.println("total de pessoas com mais de 50: "+contDois);
		
	}
}
