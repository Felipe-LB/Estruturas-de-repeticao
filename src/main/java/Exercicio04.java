import java.io.Console;
import java.util.Scanner;

public class Exercicio04 {

	/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
	
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		 if (N1 == 0) {
			System.out.println("divisao impossivel");
		} else {
			double div = N1/N2;
			System.out.printf("%.1f%n", div);
		}
	}
	
}
