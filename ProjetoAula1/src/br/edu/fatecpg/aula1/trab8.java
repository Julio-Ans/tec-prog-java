package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class trab8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = ler.nextInt();
		
		//este foi o primeiro codigo que fiz
		/*
	    int mult=1;
		while (i<num)
		  {
		   res=res+(mult+2);
			mult=mult+2;
			i++;
	 
		  }*/
		
		//ao testá-lo percebo que a soma da quantidade de numero impar é igual a multiplicação dele por ele mesmo então o codigo v2 ficou assim:
		
		
		  int res=num*num;
		
		
			System.out.println ("A soma da quantidade de numeros impares digitado no conjunto dos numeros naturais é "+res);
			
	}

}
