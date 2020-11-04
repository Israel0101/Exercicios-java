package Exercícios;

import java.util.Scanner;

public class Exer1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,totalDias;
		System.out.println("Insira quantos anos você têm: ");
		anos = ler.nextInt();
		System.out.println("Insira quantos meses: ");
		meses = ler.nextInt();
		System.out.println("Insira quantos dias: ");
		dias = ler.nextInt();
		
		totalDias=((anos*365)+(meses*30)+dias);
		
		System.out.println("Seus dias vividos são: "+totalDias);
	}
}
