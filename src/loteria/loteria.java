package loteria;

import java.util.Random;
import java.util.Scanner;

public class loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rdn = new Random();
		
		

		int opcao = 0;
		do {
			System.out.println("Você gostaria de jogar?");
			System.out.println("1 - SIM");
			System.out.println("9 - NÃO");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Digite seu numero da sorte!");
				int numero = sc.nextInt();		
				int numeroAleatorio = rdn.nextInt(100) + 1;
				
				System.out.println("Numero Escolhido: " + numero);
				System.out.println("Numero Escolhido: " + numeroAleatorio);
				
				if(numero == numeroAleatorio) {
					System.out.println("Você ganhou! Parabens!");
				}else {
					System.out.println("QUAAAAAAAAAAAAAAAAAASE, Na próxima vai!!!!!!");
				}
			}
			}while (opcao != 9);
			sc.close();
	}
}



