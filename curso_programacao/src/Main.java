import java.util.Locale;

public class Main {

	public static void main(String[] args) {
          
          String product1 = "Computer";
          String product2 = "Office desk";
          
          int age = 30;
          int code = 5290;
          char gender = 'f';
          
          double prince1 = 2100.0;
          double prince2 = 650.50;
          double measure = 53.234567;
                                                                                                 
         System.out.println("Products");
         System.out.printf("%s, which prince is $ %.2f",product1,prince1);
         System.out.printf("%n%s, which prince is $ %.2f",product2,prince2);
         System.out.printf("%n%nRecord: %d years old, code %d and gender: %s",age,code,gender);
         System.out.printf("%n%nMeasue with eight decimal places: %.8f",measure);
         System.out.printf("%nRouded (three decimal places): %.3f",measure);
         Locale.setDefault(Locale.US);
         System.out.printf("%nUS decimal point: %.3f",measure);
	}

}
