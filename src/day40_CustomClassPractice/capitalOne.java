package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class capitalOne {

    public static void main(String[] args) {

        bankAccount Beslan = new bankAccount();
        bankAccount Ahmet = new bankAccount();
        bankAccount Viorel = new bankAccount();
        bankAccount Nurmamet = new bankAccount();
        bankAccount Waqar = new bankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "4567890123");
        Ahmet.setAccountInfo("Checking", "Ahemet", "876543212");
        Viorel.setAccountInfo("Checking", "Viorel", "963258741");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "741258963");
        Waqar.setAccountInfo("Checking", "Wagar", "852147963");

        ArrayList<bankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Waqar));

        for(bankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withdraw(9000);

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("====================================");

        accounts.removeIf(each -> each.Balance < 1000);
        for(bankAccount each : accounts){
            each.getAccountInfo();
        }

    }
}
