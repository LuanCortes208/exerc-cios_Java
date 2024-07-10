package primeiroProjeto;
import java.util.Scanner;
import java.util.Locale;

public class areaGeometrica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------------------------------Bem vindo-------------------------------------");
		System.out.println("Esse programa tem como objetivo retornar a área das seguintes figuras geométricas:");
		System.out.printf("1° Quadrado%n2° Triângulo Retângulo%n3° Retângulo%n4° Círculo%n5°Trapézio%n");
		System.out.printf("%nPara isso, é preciso que digite três valores: A, B e C%n");
		System.out.println("O valor de A é base no triângulo retângulo, trapézio e lado no retângulo.");
		System.out.println("O valor de B é base no trapézio e lado no quadrado e no retângulo.");
		System.out.printf("O valor de C é altura no triângulo retângulo e no trapézio e raio no círculo.%n%n");
		System.out.println("Dito as regras, digite os valores:");
		
		System.out.print("A = ");
		double A = sc.nextDouble();
		System.out.print("B = ");
		double B = sc.nextDouble();
		System.out.print("C = ");
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double quadrado = B * B;
		double trianguloRetangulo = (A * C)/2;
		double retangulo = A * B;
		double circulo = pi * (Math.pow(C, 2));
		double trapezio = ((A + B)*C)/2;
		
		System.out.printf("%nA área do quadrado é: "+quadrado+"%n");
		System.out.println("A área do triângulo retângulo é: "+trianguloRetangulo);
		System.out.println("A área do retângulo é: "+retangulo);
		System.out.println("A área do círculo é: "+circulo);
		System.out.println("A área do trapézio é: "+trapezio);
		
		
		sc.close();
	}

}
