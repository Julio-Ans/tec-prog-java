package br.edu.fatecpg.aula2;
import java.util.Scanner;


public class trab2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int acerto=0;
		int log=0;
		int sen =0;
		int c=0;
		
		String[][] login_senha = {{"julio","123"},{"ale","456"},{"gui","789"},{"alfredo","159"},{"joana","753"},{"galo","987"}};

		while(acerto==0){
			System.out.println("Digite o login: ");
			String login=scan.nextLine();
			
	        System.out.println("Digite a senha: ");
			String senha=scan.nextLine();
			
			
		 for(int l=0;l<6;l++) {
			 if(login.equals(login_senha[l][0])){
				 log++;
				 c=l;
				 }
			
			 }
		 if(senha.equals(login_senha[c][1])){
			 sen++;
		 }
		 
		 if(log==1 && sen==1) {
		        System.out.println("Senha e Login corretos!!");			    
				 acerto++;
			}else if(log==0 || sen==0){
						 
	        System.out.println("Senha e Login não correspondem!");			    
			}
		 
		 }
			 
			 

			
			 
	         
		
		
	
	
}		 	 
}
		



