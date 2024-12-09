import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###.00");

        //VARIABLES
        String name = " ";
        double units = 0.0;
        double pricePerUnit = 0.0;
        double totalPrice = 0.0;

        //INPUT
        System.out.print("Enter name of student: ");
            name = input.nextLine();
        System.out.print("Enter number of units enrolled: ");
            units = input.nextDouble();
        System.out.print("Enter price per unit: ");
            pricePerUnit = input.nextDouble();
            totalPrice = units * pricePerUnit;

            //DISCOUNT AND PENALTIES
            double discount = totalPrice * 0.10;
            double twoInstallmentsPenalty = totalPrice * 0.05;
            double threeInstallmentsPenalty = totalPrice * 0.10;

            //COMPUTED PRICE WITH DISCOUNTS AND PENALTIES
            double cashPayment = totalPrice - discount;
            double twoInstallments = totalPrice + twoInstallmentsPenalty;
            double threeInstallments = totalPrice + threeInstallmentsPenalty;
        
        System.out.println("\nThe computed total price of your tuition fee is " + df.format(totalPrice) + " pesos");
        System.out.println(name + ", the following payment methods are available:");

        System.out.println("\nCash Payment: " + df.format(cashPayment) + " pesos");
        System.out.println("Two Installments: " + df.format(twoInstallments) + " pesos");
        System.out.println("Three Installments: " + df.format(threeInstallments) + " pesos");

        System.out.println("\nClosing Calculator...");
         input.close();
        System.out.println("Calculator Closed.");
    }
}
