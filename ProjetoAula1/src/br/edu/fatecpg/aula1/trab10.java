package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class trab10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String senha = "java123";
		
		System.out.println("Digite a senha:");
		String verifica = ler.nextLine();
		
		while(!verifica.equals(senha)) {
			System.out.println("Senha errada! Tente novamente:");
			verifica = ler.nextLine();
			if(verifica.equals(senha)){
				System.out.println("Senha correta! Parabéns!");
				break;
			}
		}
		
		}
		
				
	}


