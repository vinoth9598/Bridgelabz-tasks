
import java.util.ArrayList ;
import java.time.LocalDateTime;
public class StockAccount {

    public static void main(String[] args){
        StockAccountDetail account = new StockAccountDetail(10000);

        account.buy("TCS", 10, 3000);
        account.buy("INFY", 5, 1500);
        account.buy("TCS",2, 3100);

        account.sell("INFY",2, 1550);

        account.printReport();
    }
}

class StockAccountDetail {
    private double balance;
    private ArrayList<CompanyShares> companySharesList;

    public StockAccountDetail(double balance) {
        this.balance = balance;
        this.companySharesList = new ArrayList<>();
    }

    // Buy shares and update or add new entry
    public void buy(String symbol, int amount, double pricePerShare) {
        double totalCost = amount * pricePerShare;

        if (totalCost > balance) {
            System.out.println("Insufficient balance to buy shares.");
            return;
        }

        balance -= totalCost;

        CompanyShares existing = findCompany(symbol);

        if (existing != null) {
            existing.setNumberOfShares(existing.getNumberOfShares() + amount);
        } else {
            companySharesList.add(new CompanyShares(symbol, amount));
        }

        System.out.println("Bought " + amount + " shares of " + symbol);
    }

    // Sell shares if available
    public void sell(String symbol, int amount, double pricePerShare) {
        CompanyShares existing = findCompany(symbol);

        if (existing == null || existing.getNumberOfShares() < amount) {
            System.out.println("Not enough shares to sell.");
            return;
        }

        existing.setNumberOfShares(existing.getNumberOfShares() - amount);
        balance += amount * pricePerShare;

        System.out.println("Sold " + amount + " shares of " + symbol);

        // Remove company entry if shares become zero
        if (existing.getNumberOfShares() == 0) {
            companySharesList.remove(existing);
        }
    }

    // Helper to find company
    private CompanyShares findCompany(String symbol) {
        for (CompanyShares cs : companySharesList) {
            if (cs.getSymbol().equalsIgnoreCase(symbol)) {
                return cs;
            }
        }
        return null;
    }

    // Calculate value of all shares
    public double valueOf(double marketPricePerShare) {
        double total = 0;
        for (CompanyShares cs : companySharesList) {
            total += cs.getNumberOfShares() * marketPricePerShare;
        }
        return total;
    }

    // Print report
    public void printReport() {
        System.out.println("\n====== STOCK ACCOUNT REPORT ======");
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------------------");

        if (companySharesList.isEmpty()) {
            System.out.println("No shares in account.");
            return;
        }

        for (CompanyShares cs : companySharesList) {
            System.out.println("Company Symbol: " + cs.getSymbol());
            System.out.println("Shares Owned : " + cs.getNumberOfShares());
            System.out.println("Last Update  : " + cs.getDateTime());
            System.out.println("------------------------------------");
        }
    }
}


class CompanyShares {
    private String symbol;
    private int numberOfShares;
    private LocalDateTime dateTime;

    public CompanyShares(String symbol, int numberOfShares) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
        this.dateTime = LocalDateTime.now();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
        this.dateTime = LocalDateTime.now(); // update timestamp
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}