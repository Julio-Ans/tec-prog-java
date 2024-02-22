package br.edu.fatecpg.aula1;
import java.util.Scanner;


public class trab1 {

	public static void main(String[] args) {
		double num1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num1 = ler.nextDouble();
		
		if(num1>0) {
			System.out.println("o numero é positivo");
		}else if(num1<0){
			System.out.println("o numero é negativo");
		}else {
			System.out.println("o numero é zero");

		}
		
	}

}
