package br.edu.fatecpg.aula1;

import java.util.*;

public class trab9 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String[] nomes = new String[5]; 
		
		for(int i=0; i<5; i++) {
		System.out.println("Digite o nome numero "+(i+1)+" :");
			nomes[i] = ler.nextLine();
		}
		
		System.out.println("Digite o nome para verificar: ");
		String verifica = ler.nextLine();
		
		
		for(int j=0; j<5; j++) {
			String teste= nomes[j];

			if(verifica.equals(teste)){
				System.out.println("O sexto nome digitado está presente na lista e é o "+(j+1)+" nome");
				
			}else if(j==4 && verifica.equals(teste)){
				System.out.println("O nome digitado não está na lista");

			}else {
				System.out.println("O nome digitado não está na lista");
				break;
			}
			
		}
		
		
	
	}

}
