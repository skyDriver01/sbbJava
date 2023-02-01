package generics_two.list;

public class MyArrayList<E> implements MyListInterfaceSimple <E> {

    private E[] myArray = (E[]) new Object[0];

    @Override
    public void add(E element) {

        if(myArray == null){
            myArray[0] = element;
        }
        E[] secondArray = (E[]) new Object[1];
        System.arraycopy(myArray,0,secondArray,0,1000);
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = element;

        }
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }

    @Override
    public int size() {
        return myArray.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {
    }
}