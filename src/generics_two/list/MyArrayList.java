package generics_two.list;

public class MyArrayList implements MyListInterfaceSimple<Object> {

    private Object[] myArray = new Object[0];

    @Override
    public void add(Object element) {
        if(myArray == null){
            myArray[0] = element;
        }
        Object[] secondArray = new Object[1];
        System.arraycopy(myArray,0,secondArray,0,0);
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = element;
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        return myArray[index] = null;
    }

    @Override
    public int size() {
        return myArray.length;
    }

    @Override
    public boolean isEmpty() {
        if(myArray.length == 0){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            remove(i);
        }
    }
}