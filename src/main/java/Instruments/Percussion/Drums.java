package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentFamilyType;

public class Drums extends Instrument {

    public Drums(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Drums Noise";
    }

}
