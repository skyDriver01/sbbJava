package generics_two.list;

public class MyArrayListExtended<E> implements MyListInterfaceSimple<E>, MyListInterfaceSimpleExtended<E>{
    @Override
    public void add(E element) {

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
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {

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
    public E set(int index, E element) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}