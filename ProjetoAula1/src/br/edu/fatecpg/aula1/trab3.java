package br.edu.fatecpg.aula1;

import java.util.Scanner;
import java.lang.Math;

public class trab3 {

	public static void main(String[] args) {
		int op, aqua, l;
		double r, acir;
		Scanner ler = new Scanner(System.in);
		
		String menu="""
				********************************************
				Menu
				1-Calcular Área do Quadrado
				2-Calcular Área do Círculo 
				Digite a opção númerica do que deseja fazer:
				********************************************
				""";
        System.out.println(menu);
		op = ler.nextInt();
		
		switch(op) {
		case 1:
		System.out.println("Digite o tamanho do lado do quadrado: ");
		l = ler.nextInt();
		aqua=l*l;
		System.out.println("A área do quadrado é "+aqua);
		break;
		
		case 2:
			System.out.println("Digite o tamanho do raio do círculo: ");
			r = ler.nextDouble();
			acir=Math.PI*r*r;
			System.out.println("A área do círculo é "+acir);
			break;
		}
	}

}
