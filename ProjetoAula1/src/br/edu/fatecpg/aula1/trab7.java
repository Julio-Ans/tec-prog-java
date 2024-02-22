package br.edu.fatecpg.aula1;

import java.util.Scanner;

public class trab7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a idade da pessoa: ");
		int idade = ler.nextInt();
		
		
		if(idade<18){
    	    System.out.println("A pessoa não é adulta; é criança ou adolescente");


}else if(idade>=18 && idade<60){
    	    System.out.println("A pessoa é adulta");


} else if(idade>=60){
    	    System.out.println(" A pessoa é idosa");

}else{
    	    System.out.println("a idade nao é valida");

}
		
	}

}
