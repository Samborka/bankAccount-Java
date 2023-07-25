import entities.BankAccount;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter account holder: ");
        String accountHolder = scanner.next();

        System.out.print("Is there an initial deposit? (y/n)");
        char hasInitialDeposit = scanner.next().charAt(0);

        if(hasInitialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        }else{
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        bankAccount.showData();

        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();

        bankAccount.deposit(depositValue);

        System.out.println("Updated account data: ");
        bankAccount.showData();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();

        bankAccount.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        bankAccount.showData();



        scanner.close();
    }
}