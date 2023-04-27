package generics_two.list.aufg2;

public class MyArrayListExtended<E> implements MyListInterfaceSimpleExtended <E> {
    private Object[] myArray = new Object[0];

    public void add(Object element) {
        Object[] secondArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, secondArray, 0, myArray.length);
        myArray = secondArray;
        myArray[myArray.length - 1] = element;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        return (E) myArray[index];
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
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
        return (E) removedElement;
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
        if(myArray.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, Object element) throws IndexOutOfBoundsException {
        if(index < 0 || index > myArray.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] secondArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, secondArray, 0, index);
        secondArray[index] = element;
        System.arraycopy(myArray, index, secondArray, index + 1, myArray.length - index);
        myArray = secondArray;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < myArray.length; i++) {
            if(o == null && myArray[i] == null) {
                return i;
            } else {
                if(myArray[i] != null && myArray[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Object set(int index, Object element) throws IndexOutOfBoundsException {
        if(index < 0 || index >= myArray.length) {
            throw new IndexOutOfBoundsException();
        }
        Object previous = myArray[index];
        myArray[index] = element;
        return previous;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        Object[] otherArray = myArray;
        if(myArray.length != otherArray.length) {
            return false;
        }
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] != otherArray[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Object[] secondArray = new Object[myArray.length - 1];
        int j = 0;
        boolean removed = false;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == o) {
                removed = true;
                continue;
            }   // Todo Test implementieren und dann noch zeigen das er erfolgreich war.
            secondArray[j++] = myArray[i];
        }
        if(removed) {
            myArray = secondArray;
            return true;
        } else {
            return false;
        }
    }
}