package assignment.bank1;

import java.util.Scanner;
public class BankAccount 
{
	String name;
    long AC_NO;
    double Balance;
    boolean b = true;
    Scanner sc = new Scanner(System.in);

    void switchCase() {
        while (b) {
            System.out.println("1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit\nEnter Your Option:");
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
                    System.out.println("Enter Valid Option!");
                    break;
                }
            }
        }
    }

    BankAccount() // constructor for create a Bank Account
    {
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Enter Your Account Number:");
        AC_NO = sc.nextLong();
        Balance = 0.0;
    }

    void deposit() // deposit money into the account
    {
        System.out.println("Enter Amount to Deposit:");
        double Deposit_Amount = sc.nextDouble();
        Balance += Deposit_Amount;
    }

    void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        double WithDraw_Amount = sc.nextDouble();
        if (WithDraw_Amount > Balance) {
            System.out.println("Your withdraw amount is greater than your Balance!");
        } else {
            Balance -= WithDraw_Amount;
        }
    }

    void balanceAmount() {
        System.out.println("Balance Amount: " + Balance);
    }
    public static void main( String[] args )
    {
    	BankAccount obj = new BankAccount();
        obj.switchCase();
    }
}
