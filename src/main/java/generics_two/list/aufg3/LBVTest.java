package main.java.generics_two.list.aufg3;

public class LBVTest {
    public static void main(String[] args) throws ModulNotGradeableException {
        Modul modul = new Modul();
        modul.addLBV(new LBV(6F,0.5F));
        modul.addLBV(new LBV(4F,0.2F));
        modul.addLBV(new LBV(1F,0.2F));
        modul.addLBV(new LBV(5.5F,0.1F));
        modul.printReportEntry();
    }
}