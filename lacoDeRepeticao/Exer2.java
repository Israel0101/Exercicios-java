package LaçoDeRepetição;

import java.util.Scanner;

public class Exer2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		 int num,cont,numPar=0,numImpar=0;
		 
				 
		 for (cont=1;cont<=10;cont++)
		 {
			 System.out.println("Insira o "+cont+"º número");
			 num=ler.nextInt();
			 
			 if (num%2==0)
			 {
				 numPar++;
			 }
			 
			 
			 if (num%2==1)
			 {
				 numImpar++;
			 }	 
			 
		 }
		 
		 System.out.println("Foram digitados "+numPar+ " números pares");
		 System.out.println("Foram digitados "+numImpar+ " números ímpares");
	}
}
