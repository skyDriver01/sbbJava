package generics_two.list.aufg2;

public class MyArrayListExtended<E> implements MyListInterfaceSimpleExtended <E> {
    private Object[] myArray = new Object[0];

    public void add(Object element) {
        Object[] secondArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, secondArray, 0, myArray.length);
        myArray = secondArray;
        myArray[myArray.length - 1] = element;
        System.out.println("You have added " + element + " to your array");
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
        Object[] secondArray = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, secondArray, 0, myArray.length);
        for (int i = myArray.length - 1; i > index; i--) {
            myArray[i] = myArray[i - 1];
        }
        myArray = secondArray;
        myArray[index] = element;
        System.out.println("You have added " + element + " to your array at the index: " + index);
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
        try {
            for (int i = 0; i < myArray.length; i++) {
                if(myArray[i].equals(o)) {
                    return i;
                }
            }
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }

    @Override
    public Object set(int index, Object element) throws IndexOutOfBoundsException {
        System.out.println("You have replaced the old element at: " + index + " with this: " + element);    // Works
        return myArray[index] = element;
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
        Object[] secondArray = new Object[myArray.length + 1];
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == o) {
                myArray = secondArray;
                myArray[myArray.length - 1] = -1;
            }
            return true;
        }
        return false;
    }
}