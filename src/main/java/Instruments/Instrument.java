package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    protected String name;
    protected InstrumentFamilyType family;
    protected int costPrice;
    protected int sellPrice;

    public Instrument(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
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

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }






}
