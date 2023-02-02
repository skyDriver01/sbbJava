package generics_two.list;

public class MyArrayList implements MyListInterfaceSimple <Object> {
    private Object[] myArray = new Object[1];
    private int size = 0;

    public void add(Object element) {
        if(size == myArray.length) {
            Object[] secondArray = new Object[myArray.length * 2];
            for (int i = 0; i < myArray.length; i++) {
                secondArray[i] = myArray[i];
            }
            myArray = secondArray;
        }
        myArray[size++] = element;
        System.out.println("You have added " + element + " to your array");
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        return myArray[index] = null;       // kinda works well not really just overwrites the index with null and doesnt make it dissapear yet
    }

    @Override
    public int size() {
        return myArray.length;
    }

    @Override
    public boolean isEmpty() {
        if(myArray.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        myArray = new Object[0];
    }
}