import java.util.ArrayList;
import java.util.List;

public class IntIterator implements Iterator{
    private List<int[]> collection;
    int index = 0;

    public IntIterator() {
        collection = new ArrayList<int[]>();
    }

    public int[] getElement(){
        return collection.get(index);
    }

   public void addObject(int[] el){
        collection.add(el);
   }

    public boolean hasNext() {
        if(index < collection.size())
            return true;
        return false;

    }

    public int[] next() {
        if(this.hasNext())
        return collection.get(index++);

        return null;

    }
}
