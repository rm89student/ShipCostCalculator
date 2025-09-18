//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the item price: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * .02;
            }
            total = shippingCost + itemPrice;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total cost: $" + total);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again with a valid number");
        }
    }
}