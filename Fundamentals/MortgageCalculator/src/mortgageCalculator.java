/*           Mortgage Calculator
Principle, annual rate to monthly rate, years/period , mortgage , n = number of payments per year.
        M = P(r(1+r)pow(n))/(1+r)pow(n)-1);

 */

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
            final int percent = 100;
            final int months = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle = ");
        double principle = scanner.nextDouble();
        System.out.println("annual rate = ");
        double rate = scanner.nextDouble();
        System.out.println("Years = ");
        double year = scanner.nextInt();
        //System.out.println("number of payments per year = ");
       // double num = scanner.nextInt();

        double mortgage;
        double num;

        rate = rate/percent/months;
        num = year*months;

        mortgage = principle * rate * ((Math.pow(1+rate,num)) / (Math.pow(1+rate , num ) -1) ) ;

        //System.out.println("Mortgage is = ");
       // System.out.println(mortgage);

        //String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage is = "+ NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
