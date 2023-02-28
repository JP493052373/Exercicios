package exercicio3;
import java.util.Scanner;
public class exerc3 {
	//3 - (Repetindo a frase v2) Escreva um programa que leia,
	//respectivamente, um número inteiro e uma frase e em seguida imprima 
	//a frase digitadapelaquantidade de vezes equivalente ao número informado.
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digte um número");
		int n = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite uma frase");
		String frase = leia.nextLine();
		for(int i=0; i  < n; i = i+1)
		{
		System.out.println(i + " " + frase);
		}
		

	}

}
