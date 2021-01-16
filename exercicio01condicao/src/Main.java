import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double soma = nota1 + nota2;
		if(soma < 60.0) {
			System.out.println("NOTA FINAL = "+soma);
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("NOTA FINAL = "+soma);
		}
		sc.close();

	}

}
