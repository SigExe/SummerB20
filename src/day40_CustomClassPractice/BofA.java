package day40_CustomClassPractice;

public class BofA {

    public static void main(String[] args) {

        bankAccount Dawud = new bankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123455786");
        Dawud.getAccountInfo();
        Dawud.deposit(1000);
        Dawud.checkBalance();
        Dawud.withdraw(500);
        Dawud.checkBalance();
        Dawud.checkBalance();

    }
}
