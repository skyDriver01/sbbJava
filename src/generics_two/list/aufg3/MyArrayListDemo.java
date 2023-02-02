package generics_two.list.aufg3;

import generics_two.list.MyArrayList;
import generics_two.list.MyArrayListExtended;

public class MyArrayListDemo {
    public static void main(String[] args) {
        aufg1Array();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        MyArrayListExtended secondArray = new MyArrayListExtended();
        secondArray.add("1");
        secondArray.add("745");
        secondArray.add("done");
        secondArray.add("03424");
        secondArray.add("asd3q");
        secondArray.add("adxyca");
        secondArray.add("123");
        secondArray.add("çASDFSA");
        secondArray.add("asdasdas");
        secondArray.add("lokfdsf");
        secondArray.add("%*");
        secondArray.add("+siu");
        System.out.println(secondArray.indexOf("74"));
        System.out.println(secondArray.contains("+siu"));
        System.out.println(secondArray.size());
        System.out.println(secondArray.get(4));
        System.out.println(secondArray.get(5));
        secondArray.add(4,"112212");
        secondArray.set(6,"new Elements");
        System.out.println(secondArray.get(4));
        System.out.println(secondArray.get(5));
        System.out.println(secondArray.get(6));
        System.out.println(secondArray.get(7));
        System.out.println(secondArray.get(8));
        System.out.println(secondArray.get(9));
        System.out.println(secondArray.size());
        MyArrayListExtended ladw = secondArray;
        System.out.println(ladw.equals(secondArray));
        System.out.println(secondArray.remove("123"));
        System.out.println(secondArray.get(6));
        System.out.println(secondArray.get(7));
        System.out.println(secondArray.get(8));
    }

    private static void aufg1Array() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("String");
        myArrayList.add(String.valueOf(8));
        myArrayList.add(String.valueOf(0.9));
        myArrayList.add("SOO");
        myArrayList.add("Bleh1");
        myArrayList.add(String.valueOf(11123231));
        System.out.println("The word at the index 4 is: " + myArrayList.get(4));
        myArrayList.remove(4);
        System.out.println("The word at the index 4 is: " + myArrayList.get(4));
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
        try {
            System.out.println(myArrayList.get(4));
        }catch (Exception e){
            System.out.println("Isnt in the array");
        }
    }
}