package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class trab5 {

	public static void main(String[] args) {
		double num1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num1 = ler.nextDouble();
		
		if(num1%2==0) {
			System.out.println("o numero é par");
		}else {
			System.out.println("o numero é ímpar");

		}
	}

}
