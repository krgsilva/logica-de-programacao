import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double salario = sc.nextDouble();
		double reajuste = 0.0 ;
		int percentual = 0 ;
		if (salario > 0 && salario <= 400.00) {
			percentual = 15;
			reajuste = (salario /100) *percentual;
			salario = salario + reajuste;
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			percentual = 12;
			reajuste = (salario /100) *percentual;
			salario = salario + reajuste;
		}
		else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
			reajuste = (salario /100) *percentual;
			salario = salario + reajuste;
		}
		else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
			reajuste = (salario /100) *percentual;
			salario = salario + reajuste;
		}
		else if (salario > 2000.00) {
			percentual = 4;
			reajuste = (salario /100) *percentual;
			salario = salario + reajuste;
		}
		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: "+percentual+" %");
		
		
		
		
		
		sc.close();

	}

}
