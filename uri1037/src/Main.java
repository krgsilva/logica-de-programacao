import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
	    String intervalo = "Fora de intervalo";
	    
	    if (valor > 0.0 && valor <= 25.0000) {
	    	intervalo = "Intervalo [0,25]";
	    }
	    else if (valor >=25.00001 && valor <= 50.0000000 ) {
	    	intervalo = "Intervalo (25,50]";
	    }
	    else if(valor >=50.00000001 && valor <=75.0000000 ) {
	    	intervalo = "Intervalo (50,75]";
	    }
	    else if (valor >=75.00000001 && valor <=100.0000000) {
	    	intervalo = "Intervalo (75,100]";
	    }
		System.out.println(intervalo);
		
		
		sc.close();

	}

}
