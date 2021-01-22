import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String destino = null;
		
		if (n == 61) {
			destino = "Brasilia";
		}
		else if (n == 71) {
			destino = "Salvador";
		}
		else if (n == 11) {
			destino = "Sao Paulo";
		}
		else if (n == 21) {
			destino = "Rio de Janeiro";
		}
		else if (n == 32) {
			destino = "Juiz de Fora";
		}
		else if (n == 19) {
			destino = "Campinas";
		}
		else if (n == 27) {
			destino = "Vitoria";
		}
		else if (n == 31) {
			destino = "Belo Horizonte";
		}
		else {
			destino = "DDD nao cadastrado";
		}
		System.out.println(destino);
		sc.close();

	}

}
