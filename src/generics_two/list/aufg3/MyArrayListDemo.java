package generics_two.list.aufg3;

import generics_two.list.MyArrayList;
import generics_two.list.MyListInterfaceSimple;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyListInterfaceSimple <String> myArrayList = new MyArrayList <>();
        myArrayList.add("String");
        myArrayList.add(String.valueOf(0));
        myArrayList.add(String.valueOf(0.9));
        System.out.println(myArrayList.size());
    }
}