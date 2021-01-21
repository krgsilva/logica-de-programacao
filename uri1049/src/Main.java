import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String animal = null;
		
		if (a.equals("vertebrado")) {
			if(b.equals("ave")) {
				if(c.equals("carnivoro")) {
					animal = "aguia";
				}
				else if (c.equals("onivoro")) {
					animal = "pomba";
				}
			}
			else if (b.equals("mamifero")) {
				if(c.equals("onivoro")) {
					animal = "homem";
				}
				else if (c.equals("herbivoro")) {
					animal = "vaca";
				}
			}
		}
		else if (a.equals("invertebrado")) {
			if(b.equals("inseto")) {
				if(c.equals("hematofago")) {
					animal = "pulga";
				}
				else if (c.equals("herbivoro")) {
					animal = "lagarta";
				}
			}
			else if (b.equals("anelideo")) {
				if(c.equals("hematofago")) {
					animal = "sanguessuga";
				}
				else if (c.equals("onivoro")) {
					animal = "minhoca";
				}
			}
		}
		
		System.out.println(animal);
		
		
		
		sc.close();

	}

}
