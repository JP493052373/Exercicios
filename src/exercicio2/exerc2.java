package exercicio2;
import java.util.Scanner;
public class exerc2 {
	//2 - (Repetindo a frase) Escreva um programa que leia, respectivamente, 
	//uma frase e um número inteiro e em seguida imprima a frase 
	//digitadapelaquantidade de vezes equivalente ao número informado.
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 0;
		System.out.println("Digite uma frase");
		String frase = leia.nextLine();
		System.out.println("Digite o número de vezes que quer repetir a frase");
		double num = leia.nextDouble();
		for(i =0; i < num; i = i+1) 
		{
			System.out.println(frase + " "+ i + " vezes" );
		}
	
		

	}

}
