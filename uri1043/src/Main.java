import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
	    if (a < b + c && b < a + c && c < a + b)
		    {
		        System.out.printf("Perimetro = %.1f\n", a + b + c);
		    }
		    else
		    {
		        System.out.printf("Area = %.1f\n", c * (a + b) / 2);
		    }
		
		
		
		
		sc.close();

	}

}
