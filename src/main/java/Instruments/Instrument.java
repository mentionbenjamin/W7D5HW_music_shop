package Instruments;

public abstract class Instrument {

    protected String name;
    protected int costPrice;
    protected int sellPrice;

    public Instrument(String name, int costPrice, int sellPrice){
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }





}
