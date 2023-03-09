package generics_two.set.aufg2;

import java.util.Arrays;

public class MySet<E> implements MySetInterfaceSimple <Object> {

    private Object[] mySet = new Object[0];
    @Override
    public boolean add(Object element) {
        for (Object obj : mySet) {
            if (obj == null && element == null) {
                return false;
            }
            if (obj != null && obj.equals(element)) {
                return false;
            }
        }

        E[] secondSet = (E[]) Arrays.copyOf(mySet, mySet.length + 1);
        mySet = secondSet;
        mySet[mySet.length - 1] = element;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        boolean removed = false;
        Object[] secondSet = new Object[mySet.length - 1];
        int j = 0;
        for (int i = 0; i < mySet.length; i++) {
            if(mySet[i] == null) {
                if(object == null) {
                    removed = true;
                }
            } else {
                if(mySet[i].equals(object)) {
                    removed = true;
                    if(i == mySet.length - 1) {
                        break;
                    }
                } else {
                    secondSet[j++] = mySet[i];
                }
            }
        }
        if(removed) {
            if(j > 0) {
                mySet = secondSet;
            } else {
                mySet = new Object[mySet.length -1];
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object object) {
        for (int i = 0; i < mySet.length; i++) {
            if (mySet[i] == (object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return mySet.length;
    }

    @Override
    public boolean isEmpty() {
        return mySet.length == 0;
    }

    @Override
    public void clear() {
        mySet = Arrays.copyOf(mySet, 0);
    }

    @Override
    public String toString() {
        return getClass().getName() + "," + Integer.toHexString(hashCode());
    }
}