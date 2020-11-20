package enums;

public enum TypeImmobile {
    CASA("Casa"),
    APARTAMENTO("Apartamento"),
    TERRENO("Terreno"),
    SOBRADO("Sobrado"),
    BANGALO("Bangalo"),
    EDICULA("Edicula"),
    LOFT("Loft"),
    QUITINET("Quitinet"),
    MANSAO("Mansão"),
    FLAT("Flat");

    public String type;
    TypeImmobile(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

}
