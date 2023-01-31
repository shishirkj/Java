import java.util.Scanner;

// Simple Interest = Principle*Rate*Time/100;
public class simpleInterest {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

         double principle , rate, time ,simpleInterest;
        System.out.println("Principle = ");
         principle = obj.nextDouble();

        System.out.println("Rate = ");
        rate = obj.nextDouble();

        System.out.println("Time = ");
        time = obj.nextDouble();

        System.out.println("Simple Interest = ");

        simpleInterest = (principle * rate * time )/ 100;
        System.out.println(simpleInterest);

        double total = principle+simpleInterest;
        System.out.println(total);
    }
}