import java.util.Scanner;

public class Main {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome \n1. Nyamachoma (ksh250.00) \n2. Fries (ksh150.50)\n3. Soda (ksh90.00) \n4.Beer (ksh.180");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $2.00
            System.out.println("You've ordered a Nyamachoma");
            itemPrice = 250;
        }
        if (foodItem == 2) {
            // fries = $1.50
            System.out.println("You've ordered fries");
            itemPrice = 150;
        }
        if (foodItem == 3) {
            // soda = $1.00
            System.out.println("You've ordered a soda");
            itemPrice = 90;

                if (foodItem==4){
                    // Beer=ksh.180
                    System.out.println("You have ordered Beer");
                    itemPrice=180;
            }
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }

    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do {
            double runningTotal = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                    foodItem = 4;
                    itemPrice(foodItem);
                case 5:
                    done(runningTotal);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ordering);
        {
            subTotal(quantity(), itemPrice(foodItem));
            runningTotal = runningTotal + subTotal(quantity(), itemPrice(foodItem));
        }
    }
}
