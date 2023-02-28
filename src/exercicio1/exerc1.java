package exercicio1;
import java.util.Scanner;
public class exerc1 {
	//1 - (Diga Olá!) Escreva um programa que leia o nome do usuárioeemseguida,
	//imprima a mensagem “Olá, nome_informado !”

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.print("Informe seu nome: ");
		 String nome = ler.nextLine();
		 System.out.println("Olá," + nome + "!");

	}

}
