import java.util.Scanner ;
import java.util.ArrayList ;

public class StockReport {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StockPortfolio portfolio =new StockPortfolio();

        System.out.println("Enter number of stocks:");
        int n = sc.nextInt();

        for (int i = 0; i<n;i++){
            System.out.println("\nEnter details of Stock " + (i + 1));

            System.out.print("Stock Name :");
            String name = sc.next();

            System.out.print("Number of shares :");
            int shares = sc.nextInt();

            System.out.print("Share Price :");
            double price = sc.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }
        System.out.println();
        portfolio.printReport();

        sc.close();
    }
}

class Stock {
    private String name ;
    private int shares ;
    private double price ;

    Stock (String name, int shares, double price) {
        this.name = name ;
        this.shares = shares ;
        this.price = price ;
    }

    public double getStockValue(){
        return shares * price ;
    }
    public String getStockName(){
        return name ;
    }
    public int getNumberOfShares(){
        return shares ;
    }
    public double getSharePrice(){
        return price ;
    }
}


class StockPortfolio{
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock (Stock stock){
        stocks.add(stock);
    }

    public double getTotalStock(){
        double total = 0;
        for(Stock stock : stocks){
            total += stock.getStockValue();
        }
        return total ;
    }

    public void printReport(){
        System.out.println("=======stcok report ========");
        for(Stock stock :stocks){
            System.out.println("Stock Name : " + stock.getStockName());
            System.out.println("Shares : "+ stock.getNumberOfShares());
            System.out.println("Price :" + stock.getSharePrice());
            System.out.println("Value : " + stock.getStockValue());
            System.out.println("_________________________");
        }
        System.out.println("Total Value of Portfolio :" + getTotalStock());
    }
}