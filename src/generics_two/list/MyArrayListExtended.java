package generics_two.list;

public class MyArrayListExtended implements MyListInterfaceSimpleExtended{
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
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object removedElement = myArray[index];
        for (int i = index; i < size - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        size--;
        return removedElement;
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
// ---------------------------------All-Above-This-Works-already------------------------------------------------------------
@Override
public void add(int index, Object element) throws IndexOutOfBoundsException {
    if (index < 0 || index > size()) {
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    size++;
    for (int i = size - 1; i > index; i--) {
        myArray[i] = myArray[i - 1];
    }
    myArray[index] = element;
    System.out.println("You have added " + element + " to your array at the index: " + index);
}

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {

        return 0;
    }

    @Override
    public Object set(int index, Object element) throws IndexOutOfBoundsException {

        return null;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }
    @Override
    public boolean remove(Object o){

        return false;
    }
}