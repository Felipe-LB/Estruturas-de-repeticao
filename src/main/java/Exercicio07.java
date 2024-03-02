import java.util.Scanner;

public class Exercicio07 {
/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/
	System.out.println("Digite um número inteiro:");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i = 1; i<=n; i++) {
		int quadrado = n * n;
		int cubo = n * n * n;
		System.out.println(i);
		}
	sc.close();
	}
}
