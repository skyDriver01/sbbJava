package generics_two.set.aufg2;

public class MySet<E> implements MySetInterfaceSimple <Object> {

    private Object[] mySet = new Object[0];
    @Override
    public boolean add(Object element) {
        Object[] secondSet = new Object[mySet.length + 1];
        System.arraycopy(mySet, 0, secondSet, 0, mySet.length);
        mySet = secondSet;
        mySet[mySet.length - 1] = element;
        System.out.println(element + " Is now in your set");
        return false;
    }

    @Override
    public boolean remove(Object object) {
        Object[] secondArray = new Object[mySet.length + 1];
        for (int i = 0; i < mySet.length; i++) {
            if(mySet[i] == object) {
                mySet = secondArray;
                mySet[mySet.length - 1] = -1;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        for (int i = 0; i < mySet.length; i++) {
            if(mySet[i].equals(object)){
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
        if(mySet.length == 0){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        mySet = new Object[0];
    }
    @Override
    public String toString(){
        return getClass().getName() + "," + Integer.toHexString(hashCode());
    }
}