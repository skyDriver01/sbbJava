package generics_two.list.aufg3;

import generics_two.list.MyArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
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
        myArrayList.clear();
        try {
            System.out.println(myArrayList.get(4));
        }catch (Exception e){
            System.out.println("Isnt in the array");
        }
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
    }
}