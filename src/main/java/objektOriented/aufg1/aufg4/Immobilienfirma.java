package main.java.objektOriented.aufg1.aufg4;

public class Immobilienfirma {
    private String Headquarters;
    private String Firmname;

    public Immobilienfirma(String headquarters, String firmname) {
        Headquarters = headquarters;
        Firmname = firmname;
    }

    public String getHeadquarters() {
        return Headquarters;
    }

    public void setHeadquarters(String headquarters) {
        Headquarters = headquarters;
    }

    public String getFirmname() {
        return Firmname;
    }

    public void setFirmname(String firmname) {
        Firmname = firmname;
    }
}