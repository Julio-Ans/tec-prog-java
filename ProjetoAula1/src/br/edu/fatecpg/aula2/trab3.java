package br.edu.fatecpg.aula2;

import java.util.Scanner;

public class trab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] num = new int[3][3];
		int[][] num2 = new int[3][3];

		
		for(int l=0; l<3;l++) {
			for(int c=0; c<3;c++){
				 if(l==0) {
	                    System.out.println("Digite o numero "+c+" para a linha 1:");
	                    num[l][c] = scan.nextInt();
	                }else if(l==1){
	                    System.out.println("Digite o numero "+c+" para a linha 2:");
	                	 num[l][c] = scan.nextInt();
	                }else {
	                    System.out.println("Digite o numero "+c+" para a linha 3:");
	                    num[l][c] = scan.nextInt();
	                }
			}
			
		}
		

		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++){
	                    num2[i][j]=num[j][i];
	                    	
	                }
			}
			
		
		//impressao
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

		
		
}
}
