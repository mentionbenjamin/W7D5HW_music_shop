package Instruments;

public abstract class Instrument {

    protected String name;
    protected String family;
    protected int costPrice;
    protected int sellPrice;

    public Instrument(String name, String family, int costPrice, int sellPrice){
        this.name = name;
        this.family = family;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
    }





}
