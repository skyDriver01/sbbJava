package generics_two.list;

public  class MyArrayList<E> implements MyListInterfaceSimple<E>{

    private E[] siu = (E[]) new Object[0];

    @Override
    public void add(E element) {
        for (int i = 0; i < siu.length ; i++) {
            siu[i] = element;
        }
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int size() {
        return siu.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {
    }
}