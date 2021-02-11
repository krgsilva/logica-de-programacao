import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int inter = 0;
		int contadorinter = 0;
		int gremio = 0;
		int contadorgremio = 0;
		int repeticao = 0;
		int empate = 0;
		while (x != 2) {
		inter = sc.nextInt();
		gremio = sc.nextInt();
        repeticao = repeticao +1;
		if (inter == gremio) {
			empate = empate +1;
		}
		else if (inter > gremio) {
			contadorinter = contadorinter +1;
		}
		else if (gremio > inter) {
			contadorgremio = contadorgremio +1;
		}
		System.out.println("Novo grenal (1-sim 2-nao)");
		x = sc.nextInt();
		while (x !=1 && x !=2) {
			System.out.println("Novo grenal (1-sim 2-nao)");
			x = sc.nextInt();
		}
		}
		System.out.println(+repeticao+" grenais");
		System.out.println("Inter:"+contadorinter);
		System.out.println("Gremio:"+contadorgremio);
		System.out.println("Empates:"+empate);
		if (inter > gremio) {
			System.out.println("Inter venceu mais");
		}
		else if (gremio > inter) {
			System.out.print("Gremio venceu mais");
		}
		else
		{
			System.out.println("Nao houve vencedor");
		}
		sc.close();

	}

}
