import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for (int i =0 ; i <n ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double divisao ;
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				divisao = (double) x /y ;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		
		
		
		sc.close();

	}

}
