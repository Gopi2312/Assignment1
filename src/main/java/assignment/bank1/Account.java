package assignment.bank1;
import java.util.logging.*;
import java.util.InputMismatchException;
import java.util.Scanner;
class Account 
{
	String name;
    long acno;
    double balance;
    boolean b = true;
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");

    Account(String name,long acno,Double balance) // constructor for create a Bank Account
    {
    	this.name = name;
    	this.acno = acno;
    	this.balance = balance;
    }
    void switchCase() {
        while (b) {
            log.info("1.Deposit\n2.Withdraw\n3.balance Enquiry\n4.Exit\nEnter Your Option:");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    deposit();
                    break;
                }
                case 2: {
                    withdraw();
                    break;
                }
                case 3: {
                    balanceAmount();
                    break;
                }
                case 4: {
                    b = false;
                    break;
                }
                default: {
                    log.info("Enter Valid Option!");
                    break;
                }
            }
        }
    }
    void deposit() // deposit money into the account
    {
    	try {
        log.info("Enter Amount to Deposit:");
        double depositamount = sc.nextDouble();
        balance += depositamount;
    	}
    	catch(InputMismatchException e)
    	{
    		String str= ""+e;
    		log.info(str);
    	}
    }

    void withdraw() {
    	try {
        log.info("Enter Withdraw Amount: ");
        double withdrawamount = sc.nextDouble();
        if (withdrawamount > balance) {
            log.info("Your withdraw amount is greater than your balance!");
        } else {
            balance -= withdrawamount;
        }
    	}
    	catch(InputMismatchException e)
    	{
    		String str= ""+e;
    		log.info(str);
    	}
    }

    void balanceAmount() {
        log.log(level.INFO,()->"balance Amount: " +balance);
    }
}
