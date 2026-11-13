import java.util.*;

public class ShoppingManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] p = {"Laptop", "Mobile", "Mouse"};
        int[] price = {50000, 20000, 500};
        int total = 0, ch;

        do {
            System.out.println("\n1.View Products\n2.Buy Product\n3.Bill\n4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < p.length; i++)
                        System.out.println((i+1) + "." + p[i] + " Rs." + price[i]);
                    break;

                case 2:
                    System.out.print("Enter product number: ");
                    int id = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();

                    if (id >= 1 && id <= 3 && q > 0) {
                        total += price[id-1] * q;
                        System.out.println("Product added!");
                    } else System.out.println("Invalid input!");
                    break;

                case 3:
                    System.out.println("Total Bill: Rs." + total);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 4);

        sc.close();
    }
}