import java.util.Iterator;

public class MyLinkedListInterator<T> implements Iterator<T> {
    private MyLinkedList<T> myList;
    private int myIndex;
    public MyLinkedListInterator(MyLinkedList<T> ts) {
        this.myList = ts;
        myIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return myIndex < myList.size();
    }

    @Override
    public T next() {
        myIndex++;
        return myList.get(myIndex - 1);
    }

}
