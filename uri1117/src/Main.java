import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota  = sc.nextDouble();
		
		while (nota > 10 || nota < 0) {
			System.out.println("nota invalida");
			nota = sc.nextDouble();
			
		}
		double nota2 = sc.nextDouble();
		while (nota2 > 10 || nota2 < 0 ) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
			
		}
		double calculo = (nota + nota2) / 2;
		System.out.printf("media = %.2f%n",calculo);
		sc.close();
	}

}
