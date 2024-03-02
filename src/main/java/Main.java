import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite um número inteiro:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			 System.out.printf("Quadrado: %d, Cubo: %d%n", quadrado, cubo);
		}
		sc.close();
	}

}
