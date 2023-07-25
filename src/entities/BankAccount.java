package entities;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public BankAccount(String accountNumber, String ownerName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        deposit(initialDeposit);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double depositValue){
        this.balance += depositValue;
    }

    public void withdraw(double withdrawValue){
        this.balance -= withdrawValue + 5;
    }

    public void showData(){
        System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", this.getAccountNumber(), this.getOwnerName(), this.getBalance());
    }
}
