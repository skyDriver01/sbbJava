package generics_two.list.aufg3;

import generics_two.list.MyArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("String");
        myArrayList.add(String.valueOf(0));
        myArrayList.add(String.valueOf(0.9));
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
    }
}