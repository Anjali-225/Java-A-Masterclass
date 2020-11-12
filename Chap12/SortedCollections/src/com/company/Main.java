package com.company;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread" , 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("cake", 1.10, 7);
	    stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 3.10, 6);
        stockList.addStock(temp);

        temp = new StockItem("door", 25.65, 3);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 56);
        stockList.addStock(temp);

        temp = new StockItem("phone", 100.10, 2);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 8);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }
    }
}
