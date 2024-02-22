package br.edu.fatecpg.aula1;

import java.util.*;

public class trab9 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String[] nomes = new String[5]; 
		int repetido=0;
		
		for(int i=0; i<5; i++) {
		System.out.println("Digite o nome numero "+(i+1)+" :");
			nomes[i] = ler.nextLine();
		}
		
		System.out.println("Digite o nome para verificar: ");
		String verifica = ler.nextLine();
		
		
		for(int j=0; j<5; j++) {
			String teste= nomes[j];

			if(verifica.equals(teste)){
			repetido++;	
			}
		}
		
		/*	if(repetido==0) {
				System.out.println("Não há nomes iguais");	
				
			}else {
				System.out.print("O sexto nome digitado está presente na lista "+repetido+" vezes");
				
			}*/
		
			System.out.println(repetido==0?"Não há nomes iguais":"O sexto nome digitado está presente na lista "+repetido+" vezes");
			
		
		
	
	}

}
