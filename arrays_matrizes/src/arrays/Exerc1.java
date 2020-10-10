package arrays;

import java.util.Scanner;

public class Exerc1 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		// long[] A = new long[6];
		int[] A = {1, 0, 5, -2, -5, 7}; //a
		
		soma = soma + A[0] + A[1] + A[5];
		System.out.println("A soma das posições é: "+soma);		//b
		
		
		
		A[4] = 100; // c
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]); // d - { 1, 0, 5, -2, 100, 7} 
		}
		//System.out.println(A.length+"aa");
	}
}
