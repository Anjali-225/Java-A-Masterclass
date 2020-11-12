package com.company;

import java.util.Map;

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

        temp = new StockItem("cup", 0.45, 10);
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

        Basket myBasket = new Basket("Mine");
        sellItem(myBasket, "car", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "car", 1);
        System.out.println(myBasket);

        if (sellItem(myBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        System.out.println(myBasket);

        sellItem(myBasket, "spanner", 5);
        System.out.println(myBasket);

        sellItem(myBasket, "juice", 4);
        sellItem(myBasket, "cup", 12);
        sellItem(myBasket, "bread", 1);
        System.out.println(myBasket);

        System.out.println(stockList);

        // This will give us an unsupported operation, because its an unmodifiable map
//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("car").adjustStock(100);
        stockList.get("car").adjustStock(-10);
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null ){
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
