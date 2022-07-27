/**
 * 
 */
package br.com.deciodani.git;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author decio
 *
 */
public class Desafio_IdadeGit {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int cont = 0;
	        double soma = 0;
	        System.out.print("Idade 1 = ");
	        int n = leitor.nextInt();
	        
	//TODO: Complete os espaços em branco com uma possível solução para o desafio
	        
	        while (n >= 1){
	            if (n >= 0) {
	                soma+= n;
	                cont++;
	            }
	            System.out.print(String.format("Idade %d =",cont+1));
	            n = leitor.nextInt();
	        }
	        double media =   soma / cont;
	        System.out.println(String.format("%.2f", media));
	        	
}
}
