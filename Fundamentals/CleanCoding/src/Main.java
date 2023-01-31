import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal = 0;
        double monthlyInterest = 0;
        double numberOfPayments = 0;
        int years = 0;
        double annualInterest = 0;

       principal = (double) readNumber("Principal: ",10_000 ,1_000_000);
       annualInterest = (double) readNumber("Annual Interest = ",1,30);
       years = (int) readNumber("Years = ",1,30);


        double mortgage = calculateMortgage(principal,annualInterest,years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
    public static double calculateMortgage(double principle , double annualInterest ,double years){
        final int months = 12;
        final int percent = 100;

        short numberOfPayments = (short)(years * months);
        float monthlyInterest = (float)(annualInterest / percent / months);
        double mortgage;

         mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        return mortgage;
    }
    public static double readNumber(String prompt, double min , double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.println(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }


}