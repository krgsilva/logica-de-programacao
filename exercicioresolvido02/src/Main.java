import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		double area = base*altura;
		double perimetro = (2*base) + (2*altura);
		double diagonal = Math.sqrt(base*base+altura*altura);
		
		System.out.printf("AREA = %.4f%n",area);
		System.out.printf("PERIMETRO = %.4f%n",perimetro);
		System.out.printf("DIAGONAL = %.4f%n",diagonal);
		
		sc.close();

	}

}
