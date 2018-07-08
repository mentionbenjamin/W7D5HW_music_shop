package MusicShop.Shop;

import MusicShop.Behaviours.ISell;

import java.util.ArrayList;

public abstract class Stock {

    protected ArrayList<ISell> stock;

    public Stock(ArrayList<ISell> stock){
        this.stock = stock;
    }



//    public int getCostPrice() {
//        return this.costPrice;
//    }
//
//    public int getSellPrice() {
//        return this.sellPrice;
//    }


}
