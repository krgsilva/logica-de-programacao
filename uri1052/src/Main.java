import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes = sc.nextInt();
		String saida = null;
		if (mes == 1) {
			saida = "January";
		}
		else if (mes == 2) {
			saida = "February";
		}
		else if (mes == 3) {
			saida = "March";
		}
		else if (mes == 4) {
			saida = "April";
		}
		else if (mes == 5) {
			saida = "May";
		}
		else if (mes == 6) {
			saida = "June";
		}
		else if (mes == 7) {
			saida = "July";
		}
		else if (mes == 8) {
			saida = "August";
		}
		else if (mes == 9) {
			saida = "September";
		}
		else if (mes == 10) {
			saida = "October";
		}
		else if (mes == 11) {
			saida = "November";
		}
		else if (mes == 12) {
			saida = "December";
		}
		
		System.out.println(saida);
		
		
		sc.close();

	}

}
