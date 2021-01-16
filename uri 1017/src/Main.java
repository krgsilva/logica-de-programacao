import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempo = sc.nextDouble();
		double velocidade = sc.nextDouble();
		double litros = (tempo*velocidade) /12;
		
		
		System.out.printf("%.3f%n",litros);
		sc.close();
	}

}
