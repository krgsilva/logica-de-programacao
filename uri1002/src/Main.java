import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double raio = sc.nextDouble();
		double n = 3.14159;
		double area;
		
		raio =  Math.pow(raio, 2.0);;
		area = n * raio;
		
		System.out.printf("A=%.4f%n",area);
		
		
		
		sc.close();

	}

}
