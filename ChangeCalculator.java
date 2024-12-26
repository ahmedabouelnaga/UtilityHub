/** Change.java - add your solutiuon to program 3 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class ChangeCalculator {
    
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount;
        //ten dollars, five dollars,one dollar, 10 cents, 5 cents, cents

        int ten,five,one,quarter,dime,nickel,cents;
        double price,amountpaid;
        System.out.println("Enter the price below: ");
        price=scan.nextDouble();
        System.out.println(" Enter the amount paid: ");
        amountpaid = scan.nextDouble();
        amount=amountpaid - price;
        cents = (int)amount;
        cents = (int) (100 * amount);

        ten = (cents / 1000);
        five = (int) ((amount - (ten * 10))/5);
        one = (int) ((amount-(ten*10)-(five*5))/1);
        quarter = (int)((amount-(ten*10)-(five*5)-(one * 1))/0.25);
        dime = (int) ((amount-(ten*10)-(five * 5)-(one * 1)-(quarter * 0.25))/0.1);
        nickel= (int) ((amount-(ten * 10)-(five * 5)- (one * 1)- (quarter * 0.25)-(dime * 0.1))/0.05);
//will print out the final amount of change that is left for the cashier to give back to the customer after they pay

        System.out.println("# of Ten dollars:" + ten);
        System.out.println("# of Five dollars:" + five);
        System.out.println("# of One dollar:"+ one);
        System.out.println("# of Quarters:" + quarter);
        System.out.println("# of Dimes:" + nickel);

        
        
        
    }
    
    
}