package Exercícios;

import java.util.Scanner;

public class Exer3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int duraEvent,hora,minuto,segundo;
		System.out.println("Insira a duração do evento em segundos: ");
		duraEvent = ler.nextInt();
		
		hora = duraEvent/3600;
		minuto = (duraEvent%3600)/60;
		segundo = (duraEvent%3600)%60;
		
		System.out.println("Horas: "+ hora);
		System.out.println("Minutos: "+ minuto);
		System.out.println("Segundos: "+ segundo);
		
	}
}
