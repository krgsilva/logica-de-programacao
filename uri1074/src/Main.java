import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		for (int i =0; i < n ; i++) {
			x = sc.nextInt();
			if (x %2 !=0 && x > 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (x %2 !=0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if (x < 0){
				System.out.println("EVEN NEGATIVE");
			}
			else if (x > 0){
				System.out.println("EVEN POSITIVE");
			}
			else if (x == 0){
				System.out.println("NULL");
			}
		}
		
		
		
		
		sc.close();

	}

}
