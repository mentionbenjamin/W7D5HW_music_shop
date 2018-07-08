package MusicShop.Instruments;

public enum InstrumentFamilyType {

    BRASS("Brass"),
    STRING("String"),
    PERCUSSION("Percussion");

    private String family;

    InstrumentFamilyType(String family){
        this.family = family;
    }

    public String getFamily(){
        return this.family;
    }

}

