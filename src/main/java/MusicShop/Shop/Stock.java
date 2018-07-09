package MusicShop.Shop;

import MusicShop.Behaviours.ISell;

import java.util.ArrayList;
import java.util.BitSet;

public class Stock {

    protected ArrayList<ISell> stockItems;

    public Stock(ArrayList<ISell> stockItems){
        this.stockItems = stockItems;
    }

    public int getStockItems() {
        return this.stockItems.size();
    }

    public void addStock(ISell item){
        stockItems.add(item);
    }

    public void removeStock(ISell item){
        stockItems.remove(item);
    }

    public double getTotalValueAtCostPrice() {
        double totalValueAtCostPrice = 0.0;
        for (ISell item : stockItems){
            totalValueAtCostPrice += item.getCostPrice();
        }
        return totalValueAtCostPrice;
    }

    public double getTotalValueAtSellPrice() {
        double totalValueAtSellPrice = 0.0;
        for (ISell item : stockItems){
            totalValueAtSellPrice += item.getSellPrice();
        }
        return totalValueAtSellPrice;
    }

    public double getTotalProfit() {
        double totalProfit = getTotalValueAtSellPrice() - getTotalValueAtCostPrice();
        return totalProfit;
    }
}

