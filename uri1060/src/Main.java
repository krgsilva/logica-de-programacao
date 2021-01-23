import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		int quantidade = 0;
		
		if (a >= 0) {
			quantidade = quantidade + 1;
		}
		if (b >= 0) {
			quantidade = quantidade + 1;
		}
		if (c >= 0) {
			quantidade = quantidade + 1;
		}
		if (d >= 0) {
			quantidade = quantidade + 1;
		}
		if (e >= 0) {
			quantidade = quantidade + 1;
		}
		if (f >= 0) {
			quantidade = quantidade + 1;
		}
		System.out.println(+quantidade+" valores positivos");
		
		sc.close();

	}

}
