import java.util.Scanner;

public class TemperatureConvertor {
    
    public static final void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int celcuis,fahrenheit;
        System.out.print("fahrenheit");
        fahrenheit = sc.nextInt();
        //to convert fahrenheit to celcuis

        celcuis = (fahrenheit - 32)* 5/9;
      
        // to print the conversion
        System.out.println("celcuis: " +celcuis);

        
        
        
        
    }
    
    
}