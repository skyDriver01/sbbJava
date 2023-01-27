package interFaceTest;

public interface calculateInterFace {

    default double multiply(double a, double b) {
        return a * b;
    }


    default double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b);
}
