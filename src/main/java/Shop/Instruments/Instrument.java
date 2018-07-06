package Shop.Instruments;

import Shop.Behaviours.ISell;
import Shop.Stock;

public abstract class Instrument extends Stock implements IPlay, ISell {

    protected String name;
    protected InstrumentFamilyType family;

    public Instrument(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
        super(costPrice, sellPrice, ArrayList<ISell>);
        this.name = name;
        this.family = family;
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
