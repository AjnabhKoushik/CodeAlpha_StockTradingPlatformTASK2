import java.util.HashMap;

public class Portfolio {

    private HashMap<String, Integer> holdings = new HashMap<>();

    public void buyStock(String stock, int qty) {

        holdings.put(stock, holdings.getOrDefault(stock, 0) + qty);

    }

    public void sellStock(String stock, int qty) {

        if (holdings.containsKey(stock)) {

            int current = holdings.get(stock);

            if (current >= qty) {

                holdings.put(stock, current - qty);

            } else {

                System.out.println("Not enough shares!");

            }

        } else {

            System.out.println("Stock not found.");

        }

    }

    public void displayPortfolio() {

        System.out.println("\nPortfolio");

        for (String s : holdings.keySet()) {

            System.out.println(s + " : " + holdings.get(s) + " shares");

        }

    }

}
