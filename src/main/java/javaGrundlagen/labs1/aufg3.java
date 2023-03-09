package main.java.javaGrundlagen.labs1;

public class aufg3 {
    public static void main(String[] args) {
        recheckFlaeche(4, 5);
        kreisFlaeche(3);
        rechteckUmfang(4, 5);
        quadratischePyramide(8, 3, 5);
        vielfache(3);
    }

    public static void recheckFlaeche(int a, int b) {
        System.out.println(a * b);
    }

    public static void kreisFlaeche(int r) {
        double pi = 3.1415926535897;
        System.out.println(Math.pow(r,2) * pi); // math ist
    }

    public static void rechteckUmfang(int a, int b) {
        System.out.println((a + b) * 2);
    }

    public static void quadratischePyramide(int h, int a, int b) {
        System.out.println((a * b * h) / 2);
    }

    public static void vielfache(int a) {
        System.out.println((a * 3) + (a * 5));
    }
}
