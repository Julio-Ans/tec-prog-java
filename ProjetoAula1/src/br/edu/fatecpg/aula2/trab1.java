package br.edu.fatecpg.aula2;

import java.util.Scanner;

public class trab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] num = new int[3][3];
		int[][] num2 = new int[3][3];
		int[][] num3 = new int[3][3];


		//povoa primeira matriz
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++){
				 if(i==0) {
	                    System.out.println("Digite o numero "+j+" para a linha 1:");
	                    num[i][j] = scan.nextInt();
	                }else if(i==1) {
	                    System.out.println("Digite o numero "+j+" para a linha 2:");
	                	 num[i][j] = scan.nextInt();
	                }else {
	                    System.out.println("Digite o numero "+j+" para a linha 3:");
	                    num[i][j] = scan.nextInt();
	                }
			}
			
		}
		
		//povoa segunda matriz

		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++){
				 if(i==0) {
	                    System.out.println("Digite o numero "+j+" para a linha 1:");
	                    num2[i][j] = scan.nextInt();
	                }else if(i==1) {
	                    System.out.println("Digite o numero "+j+" para a linha 2:");
	                	 num2[i][j] = scan.nextInt();
	                }else {
	                    System.out.println("Digite o numero "+j+" para a linha 3:");
	                    num2[i][j] = scan.nextInt();
	                }
			}
			
		}
		
		
		//soma as duas matrizes e forma a terceira
		for (int i = 0; i <3; i++) {
	        for (int j = 0; j <3; j++) {
	            num3[i][j] = num[i][j] + num2[i][j];
	        }
	    }
		
		//imprime a primeira matriz
		for (int i = 0; i <3; i++) {
	        for (int j = 0; j <3; j++) {
	        	if(i==0){
                    System.out.print(num[i][j] + " ");
	        	}else if(i==1) {
                    if(i==1 && j==0) {System.out.print("\n");}
                    System.out.print(num[i][j] + " ");
	        	}else {
                    if(i==2 && j==0) {System.out.print("\n");}
                    System.out.print(num[i][j] + " ");
	        	}

                }
	        }
	
		//imprime a segunda matriz
		for (int i = 0; i <3; i++) {
	        for (int j = 0; j <3; j++) {
	        	if(i==0){
                    if(i==0 && j==0) {System.out.print("\n");}
                    System.out.print(num2[i][j] + " ");
	        	}else if(i==1) {
                    if(i==1 && j==0) {System.out.print("\n");}
                    System.out.print(num2[i][j] + " ");
	        	}else {
                    if(i==2 && j==0) {System.out.print("\n");}
                    System.out.print(num2[i][j] + " ");
	        	}

                }
	        }
		
		//imprime a terceira matriz soma das duas primeiras
		for (int i = 0; i <3; i++) {
	        for (int j = 0; j <3; j++) {
	        	if(i==0){
                    if(i==0 && j==0) {System.out.print("\n");}
                    System.out.print(num3[i][j] + " ");
	        	}else if(i==1) {
                    if(i==1 && j==0) {System.out.print("\n");}
                    System.out.print(num3[i][j] + " ");
	        	}else {
                    if(i==2 && j==0) {System.out.print("\n");}
                    System.out.print(num3[i][j] + " ");
	        	}

                }
	        }
}

}
