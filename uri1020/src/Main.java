import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int ano,mes,dia ;
		
		ano = idade / 365 ;
		System.out.println(+ano+" ano(s)");
		idade = idade % 365;
		
		mes = idade / 30;
		System.out.println(+mes+" mes(es)");
		idade = idade %30;
		
		dia = idade; 
		System.out.println(+dia+" dia(s)");
		
		
		sc.close();

	}

}
