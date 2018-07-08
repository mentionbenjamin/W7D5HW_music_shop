package Shop.Instruments;

import Shop.Behaviours.ISell;
import Shop.Stock;

public abstract class Instrument extends Stock implements IPlay, ISell {

    protected String name;
    protected InstrumentFamilyType family;

    public Instrument(String name, InstrumentFamilyType family){
        this.name = name;
        this.family = family;
    }

    public String getName(){
        return this.name;
    }

    public String getFamily() {
        return this.family.getFamily();
    }

}
