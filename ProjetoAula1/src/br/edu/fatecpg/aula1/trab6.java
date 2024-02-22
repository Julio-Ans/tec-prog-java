package br.edu.fatecpg.aula1;

import java.util.Scanner;


public class trab6 {

	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		int	res=num;
		
		while(num>1){
		    res=res*(num-1);
		    num--;
 
		}
		    System.out.println("O fatorial do número" +num+" é "+res);
 
	}
	
	
	}	

