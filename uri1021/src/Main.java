import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		int cem = (int)n / 100;
		System.out.println(+cem+" nota(s) de R$ 100.00");
		n = n % 100;
		
		int ciquenta = (int)n /50 ;
		System.out.println(+ciquenta+" nota(s) de R$ 50.00");
		n = n % 50;
		
		int vinte = (int)n / 20;
		System.out.println(+vinte+" nota(s) de R$ 20.00");
		n = n % 20;
		
		int dez = (int)n / 10;
		System.out.println(+dez+" nota(s) de R$ 10.00");
		n = n % 10;
		
		int cinco = (int)n / 5;
		System.out.println(+cinco+" nota(s) de R$ 5.00");
		n = n % 5;
		
		int dois = (int) n / 2;
		System.out.println(+dois+" nota(s) de R$ 2.00");
		n = n % 2;
		
		System.out.println("MOEDAS:");
		int um = (int) n / 1;
		System.out.println(+um+" moeda(s) de R$ 1.00");
		n = n % 1;
		
		double cinquentacentavo = n / 0.50 ;
		System.out.println((int)+cinquentacentavo+" moeda(s) de R$ 0.50");
		n = n % 0.50;
		
		double vintecinco = n / 0.25;
		System.out.println((int)+vintecinco+" moeda(s) de R$ 0.25");
		n = n % 0.25;
		
		double dezcentavo = n / 0.10;
		System.out.println((int)+dezcentavo+" moeda(s) de R$ 0.10");
		n = n % 0.10;
		
		double cincocentavo = n / 0.05;
		System.out.println((int)+cincocentavo+" moeda(s) de R$ 0.05");
		n = n % 0.05;
		
		double umcentavo = n / 0.01;
		System.out.println((int)+umcentavo+" moeda(s) de R$ 0.01");
		sc.close();
		
		
	}

}
