package model;

public enum Category {
    DRINKS,
    TOYS,
    OTHER;

    public double getVatPercent(){
        return switch(this){
            case DRINKS ->  0.21;
            case TOYS -> 0.23;
            case OTHER -> 0.18;
        };
    }
}
