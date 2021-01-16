import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//String x ;
		//x = sc.next();
		
		//System.out.println("Você digitou :"+x);
		
		//int c ;
		//c = sc.nextInt();		
		//System.out.println("Você digitou :"+c);
		
		//double d ;
		//d = sc.nextDouble();		
		//System.out.println("Você digitou :"+d);
		
		//char x ;
		
	   //  x = sc.next().charAt(0);
	     //System.out.println("Você digitou : "+x);
	     
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); // ele ler a linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
