package interFaceTest;

public class interfaceTest implements calculateInterFace {


    @Override
    public double add(double a, double b) {
        return calculateInterFace.super.add(a, b);
    }
    @Override
    public double multiply(double a, double b){
        return a * b;
    }

    @Override
    public double subtract(double a, double b) {
       return a-b;
    }
}