package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class trab4 {

	public static void main(String[] args) {
		int num, i, resul;
		Scanner ler = new Scanner(System.in);

		System.out.println("Vc quer a tabuada de qual número?");
		num = ler.nextInt();
	
		for (i=0; i<11; i++) {
		System.out.println(num+"x"+i+" = "+(num*i));
		}
		
		
		
		
	}

	}

