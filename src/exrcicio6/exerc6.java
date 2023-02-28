package exrcicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exerc6 {
	//6 - (Juntando tudo) Escreva um programa que agrupe todos os 5
	//exercícios anteriores da seguinte forma: o programa deve fornecer um menu 
	//listando os nomes dos exercícios e pedir para o usuário selecionar um deles 
	//digitando um número entre 1 e 5, além de uma opção para sair 
	//(pode ser o número zero). O usuário informará um número e o programa executará 
	//o código d oexercício selecionado. Após a execução do exercício selecionado,
	//o menu deverá ser exibido novamente.
	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, aux;
	
	try {
	
	do {
		
		System.out.println("\t O MENU ");	
		System.out.println("Escolha um exercício: ");
		System.out.println("Exercício 1 ");
		System.out.println("Exercício 2 ");
		System.out.println("Exercício 3 ");
		System.out.println("Exercício 4 ");
		System.out.println("Exercício 5 ");
		System.out.println("Digite 0 para sair");
		aux = ler.nextInt();
	switch(aux){
	
	case 1:	
		System.out.println("Diga Ola!:");
		System.out.println("Informe seu nome: ");
		ler.nextLine();
		String nome = ler.nextLine();
		System.out.println("Olá," + nome + "!");
		System.out.println("---------------------");
		System.out.println("Digite 1 para voltar ao menu ou 0 para sair");
	    System.out.println(" ");
		System.out.println("----------------------");
		aux = ler.nextInt();

				
	break;
				
	case 2:
		System.out.println("Repetindo a frase:");
		ler.nextLine();		
		System.out.println("Digite  uma frase: ");
		String frase = ler.nextLine();
		System.out.println("Digite o número de vezes que quer repetir a frase");
		double num = ler.nextDouble();
		for(i =0; i < num; i = i+1) 
		{
			System.out.println(frase + " "+ i + " vezes" );
		}
		 System.out.println("---------------------");
		 System.out.println("Digite 1 para voltar ao menu ou 0 para sair");
		 System.out.println(" ");
		 System.out.println("----------------------");
		 aux = ler.nextInt();
	
	break;
			
	case 3:
		System.out.println("Repetindo a frase v2:");
        System.out.println("Digite um número ");
		int n = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite uma frase: ");
		String frasenova = ler.nextLine();
	    for (i = 0; i < n; i = i+1)
	    {
	        System.out.println(i + " " + frasenova);	        
	    }
	    System.out.println("---------------------");
	    System.out.println("Digite 1 para voltar ao menu ou 0 para sair");
	    System.out.println(" ");
	    System.out.println("----------------------");
	    aux = ler.nextInt();
				
	break;
			
	case 4: 
		System.out.println("Geometria:");
		System.out.println("digite a altura do retângulo:");
		double A = ler.nextDouble();
	    System.out.println("digite a base do retangulo");
		double B = ler.nextDouble();
		double area = B * A;
		double perimetro = (2 * B) + (2 * A);
		System.out.println("A área do retângulo é = " +area);
		System.out.println("O Perímetro do retângulo é = "+perimetro);	
		System.out.println("---------------------");
	    System.out.println("Digite 1 para voltar ao menu ou 0 para sair");
	    System.out.println(" ");
	    System.out.println("----------------------");
	    aux = ler.nextInt();
			
		
	break;
	
	case 5:
		System.out.println("Digite uma frase");
		 ler.nextLine();
		 String nomenovo = ler.nextLine();
		 System.out.println("Digte um número inteiro");
			int R = ler.nextInt();
			System.out.println("Digte outro número inteiro");
			int T = ler.nextInt();
			
		for (int i1 = 0; i1 < R; i1++) {
			System.out.println("\n");
			for (int j = 0; j < T; j++) {
				
				System.out.printf( nomenovo + "  ");
			}
		}
		
		System.out.println("  ");
		System.out.println("----------------------");
	    System.out.println("Digite 1 para voltar ao menu ou 0 para sair");
	    System.out.println(" ");
		System.out.println("----------------------");
		aux = ler.nextInt();
	
		
		
		
		
	break;	
	}
	}while(aux != 0);
		System.out.println("O sistema foi finalizado");
	}
	
	catch(InputMismatchException e)
	{
		System.out.println("Aconteceu algum erro inesperado");
	}
}
}
		