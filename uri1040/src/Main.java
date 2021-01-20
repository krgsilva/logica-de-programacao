import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = ((n1*2) + (n2*3)+ (n3*4) + (n4*1)) /10;
		
		if(media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 5.0 && media <=6.9) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			float recalculo = (media + exame) /2;
			System.out.printf("Nota do exame: %.1f%n", exame);
			if(recalculo >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", recalculo);
			}
			else if (recalculo <= 4.9) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", recalculo);
			}
		}
		sc.close();

	}

}
