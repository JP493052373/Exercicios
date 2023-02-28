package exercicio5;
import java.util.Scanner;
public class exerc5 {
	//5 - (Bidimensional) Escreva um programa que leia uma palavra e dois números 
	//inteiros denominados linhas e colunas, e em seguida imprima a palavra 
	//repetidas vezes de acordo com o número de linhas e colunas informados.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma frase");
		 String nome = ler.nextLine();
		 System.out.println("Digte um número inteiro");
			int A = ler.nextInt();
			System.out.println("Digte outro número inteiro");
			int B = ler.nextInt();
			
		for (int i = 0; i < A; i++) {
			System.out.println("\n");
			for (int j = 0; j < B; j++) {
				
				System.out.printf( nome + "  ");
			}
		}

	}

}
