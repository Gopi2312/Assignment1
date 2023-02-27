package assignment.bank1;
import java.util.logging.*;
import java.util.InputMismatchException;
import java.util.Scanner;
class BankAccount{
	public static void main( String[] args )
    {
		String name = "";
	    long acno = 0;
	    double balance = 0.0;
	    
	    Scanner sc = new Scanner(System.in);
	    Logger log = Logger.getLogger("hi");
        try {
            log.info("Enter Your Name:");
            name = sc.nextLine();
            log.info("Enter Your Account Number:");
            acno = sc.nextLong();
        	}
        	catch(InputMismatchException e)
        	{
        		String str= ""+e;
        		log.info(str);
        	}
        Account obj = new Account(name,acno,balance);
        obj.switchCase();
    }
}