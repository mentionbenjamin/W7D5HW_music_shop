package MusicShop.Instruments;

import MusicShop.Behaviours.IPlay;
import MusicShop.Behaviours.ISell;
import MusicShop.Shop.Stock;

public abstract class Instrument implements IPlay, ISell {

    protected String name;
    protected InstrumentFamilyType family;
    protected double costPrice;
    protected double sellPrice;

    public Instrument(String name, InstrumentFamilyType family, double costPrice, double sellPrice){
        this.name = name;
        this.family = family;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }

    public String getFamily() {
        return this.family.getFamily();
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

}
