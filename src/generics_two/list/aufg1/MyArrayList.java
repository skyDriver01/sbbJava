package generics_two.list.aufg1;

public class MyArrayList<E> implements MyListInterfaceSimple <Object> {
    private Object[] myArray = new Object[0];

    public void add(Object element) {
        Object[] secondArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, secondArray, 0, myArray.length);
        myArray = secondArray;
        myArray[myArray.length - 1] = element;
        System.out.println("You have added " + element + " to your array");
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        if(index >= myArray.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object removedElement = myArray[index];
        Object[] secondArray = new Object[myArray.length - 1];
        for (int i = 0, k = 0; i < myArray.length; i++) {
            if(i == index) {
                continue;
            }
            secondArray[k++] = myArray[i];
        }
        myArray = secondArray;
        return removedElement;
    }

    @Override
    public int size() {
        return myArray.length;
    }

    @Override
    public void clear() {
        myArray = new Object[0];
    }

    @Override
    public boolean isEmpty() {
        if(myArray.length == 0 || myArray.equals(null)) {
            return true;
        }
        return false;
    }
}