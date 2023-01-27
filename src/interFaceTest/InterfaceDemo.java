package interFaceTest;

public class InterfaceDemo {
    public static void main(String[] args) {
        interfaceTest testTest= new interfaceTest();
        testTest.add(1,2);
        InterfaceTest2 interfaceTest2 = new InterfaceTest2();
        interfaceTest2.multiply(1,2);
        interfaceTest2.subtract(1,2);
        test(interfaceTest2);
        test(testTest);
    }
    public static double test(calculateInterFace interfaceTest){
        return interfaceTest.add(1,2);
    }
}