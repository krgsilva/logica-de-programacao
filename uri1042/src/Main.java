import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int primeiro = 0 ;
		int segundo = 0 ;
		int terceiro = 0;
		
		
		if (a > b && a > c) {
			primeiro = a ;
			if(b > c) {
				segundo = b;
				terceiro = c;
			}
			else {
				segundo = c;
				terceiro = b;
			}
		}
		else if (b > a && b > c) {
			primeiro = b;
			if (a > c) {
				segundo = a;
				terceiro = c;
			}
			else {
				segundo = c;
				terceiro = a;
			}
		}
		else if (c > b && c > a) {
			primeiro = c;
			if (b > a) {
				segundo = b;
				terceiro = a;
			}
			else {
				segundo = a;
				terceiro = b;
			}
		}
		
		System.out.println(terceiro);
		System.out.println(segundo);
		System.out.println(primeiro);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		sc.close();

	}

}
