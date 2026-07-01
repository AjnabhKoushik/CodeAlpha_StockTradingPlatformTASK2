import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock tcs = new Stock("TCS", 3500);
        Stock infosys = new Stock("Infosys", 1700);
        Stock reliance = new Stock("Reliance", 2800);

        User user = new User("Investor");

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");

            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter choice : ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.println("\nMarket Data");

                    System.out.println("1. " + tcs.getName() + " : ₹" + tcs.getPrice());

                    System.out.println("2. " + infosys.getName() + " : ₹" + infosys.getPrice());

                    System.out.println("3. " + reliance.getName() + " : ₹" + reliance.getPrice());

                    break;

                case 2:

                    System.out.print("Enter Stock Name : ");

                    String buy = sc.next();

                    System.out.print("Quantity : ");

                    int q = sc.nextInt();

                    user.getPortfolio().buyStock(buy, q);

                    System.out.println("Stock Bought Successfully!");

                    break;

                case 3:

                    System.out.print("Enter Stock Name : ");

                    String sell = sc.next();

                    System.out.print("Quantity : ");

                    int s = sc.nextInt();

                    user.getPortfolio().sellStock(sell, s);

                    break;

                case 4:

                    user.getPortfolio().displayPortfolio();

                    break;

                case 5:

                    System.out.println("Thank You!");

                    System.exit(0);

            }

        }

    }

}

// SAMPLE OUTPUT:
  
// ===== STOCK TRADING PLATFORM =====

// 1. View Market
// 2. Buy Stock
// 3. Sell Stock
// 4. View Portfolio
// 5. Exit

// Enter choice : 1

// Market Data

// TCS : ₹3500.0
// Infosys : ₹1700.0
// Reliance : ₹2800.0

// Enter choice : 2

// Enter Stock Name : TCS
// Quantity : 5

// Stock Bought Successfully!

// Enter choice : 4

// Portfolio

TCS : 5 shares
