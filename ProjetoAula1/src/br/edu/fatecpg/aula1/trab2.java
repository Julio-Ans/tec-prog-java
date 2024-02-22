package br.edu.fatecpg.aula1;
import java.util.Scanner;


public class trab2 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num1>num2) {
			System.out.println("os numeros são diferentes sendo o primeiro o maior");
		}else if(num2>num1) {
			System.out.println("os numeros são diferentes sendo o segundo o maior"); 
		}else if(num1==num2){
			System.out.println("os numeros são iguais"); 
		}else {
			System.out.println("os números digitados são inválidos"); 
		}
}
}