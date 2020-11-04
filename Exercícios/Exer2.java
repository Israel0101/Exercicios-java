package Exercícios;

import java.util.Scanner;

public class Exer2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dia,mes,ano;
		System.out.println("Insira seus dias vividos: ");
		dia = ler.nextInt();
		
		mes=dia/30;
		ano=dia/365;
		
		System.out.println("Você tem: "+ano+" anos de idade");
		System.out.println(mes+" meses");
		System.out.println(dia+" dias");
	}
	
	
}
