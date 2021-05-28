import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i =0 ; i < n ;i++) {
			double media1 = sc.nextDouble();
			double media2 = sc.nextDouble();
			double media3 = sc.nextDouble();
			double mediageral;
			media1 = media1 * 2;
			media2 = media2 * 3;
			media3 = media3 * 5;
			mediageral = (media1+media2+media3) / 10;
			System.out.printf("%.1f%n",mediageral);
		}
		
		
		
		sc.close();
		

	}

}
