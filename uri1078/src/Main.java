import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int soma = 0;
      
      for (int i = 1; i < 11 ; i++) {
    	  soma = i * n ;
    	  System.out.println(+i+" x "+n+" = "+soma+"");
      }
      
      
      
      
      sc.close();
	}

}
