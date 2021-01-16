import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int peca1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int peca2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double soma = (valor1*peca1)+(valor2*peca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",soma);
		sc.close();

	}

}
