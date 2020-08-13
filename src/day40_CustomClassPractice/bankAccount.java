package day40_CustomClassPractice;

/*
Task1
    create a custom class for BankAccount
        attributes/data that can have are:
          1. AccountType  2. AccountHolder, 3. AccountNumber, 4. Balance
          Actions: showBalance, deposit, withdraw
          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available
                balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should
                not be able to withdraw money
            3. user should be able to see their balance

 */

public class bankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double Balance;

    public void setAccountInfo(String accountType, String accountHolder, String accountNumber){
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void getAccountInfo(){
        System.out.println("================================");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + Balance);
        System.out.println("================================");

    }

    public void checkBalance(){
        System.out.println("Available Balance: " + Balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $" + amount + " into " + accountNumber);
        Balance += amount;
    }

    public void withdraw(double amount){

        if(amount > Balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
        Balance -= amount;
    }


}
