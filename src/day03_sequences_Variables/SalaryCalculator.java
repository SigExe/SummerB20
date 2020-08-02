package day03_sequences_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;
        double totalTax = salary * tax; // 28,000
        double Salaryaftertax = salary - totalTax; //72,000



        System.out.println(Salaryaftertax);



    }


}
