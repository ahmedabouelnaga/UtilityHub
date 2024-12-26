import java.util.Scanner;

public class TimeConvertor {
    
    public static final void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int hours, days, weeks, years, minutes;
        System.out.print("# of Hours: ");
        hours = scan.nextInt();

        System.out.print("# of Days: ");
        days = scan.nextInt();
       
       
        System.out.print("# of Weeks: ");
        weeks = scan.nextInt();

        System.out.print("# of Years: ");
        years = scan.nextInt();


        minutes = (hours * 60) + (days * 1440) + (weeks * 10080) + (years * 525600);
//prints out the total number of minutes after combining what is given in hours, days, weeks, and years
        System.out.println("# of minutes:  " +minutes);        

        
        
        
    }
    
    
}