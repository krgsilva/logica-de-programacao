import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//repetindo sempre uma vez , sendo que a condi��o no final
		char resp;
		do {
		System.out.print("Digite a temperatuda em Celsius: ");
		double c = sc.nextDouble();
		double f = 9.0 * c / 5.0 + 32.0;
		
		System.out.printf("Equivalente em Fahrenheit:%.1f%n", f);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}while (resp != 'n');
		sc.close();

	}

}
