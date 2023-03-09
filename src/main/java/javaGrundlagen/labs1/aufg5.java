package main.java.javaGrundlagen.labs1;

public class aufg5 {
    public static void main(String[] args) {
        groesserOderKleiner(6);
        begruessung("Max");
        System.out.println(schaltJahr(2023));
        geradeOderUngerade(5);
    }

    public static void groesserOderKleiner(int a) {
        if (a < 0) {
            System.out.println(a + " is smaller than 0");
        } else if (a > 0) {
            System.out.println(a + " is bigger than 0");
        } else {
            System.out.println("its 0 -_-");
        }
    }

    public static void begruessung(String deinName) {
        if (deinName.equals("Luka")) {
            System.out.println("Guten morgen " + deinName);
        }
        else {
            System.out.println("Du bist nicht diese Person");
        }
    }

    public static boolean schaltJahr(int naechstesJahr) {
        if (naechstesJahr % 4 == 0) {
            if (naechstesJahr % 100 == 0 && naechstesJahr % 400 != 0){
                return false;
            }
            return true;
        }
        return false;
    }

    public static void geradeOderUngerade(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " ist gerade");
        } else {
            System.out.println(a + " ist ungerade");
        }
    }
}
