package exercicio4;
import java.util.Scanner;
public class exerc4 {
	//4 - (Geometria) Escreva um programa que solicite a altura e a base
	//deumretângulo e informe sua área e perímetro.
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("O calculo do retangulo");
		System.out.println("digite a altura do retângulo:");
		double A = leia.nextDouble();
	    System.out.println("digite a base do retangulo");
		double B = leia.nextDouble();
		double area = B * A;
		double perimetro = (2 * B) + (2 * A);
		System.out.println("A área do retângulo é = " +area);
		System.out.println("O Perímetro do retângulo é = "+perimetro);
		}

	}


