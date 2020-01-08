

import java.util.ArrayList;
import java.util.List;

public class Context {
    private Sort currentSort;
    private int tab[] = new int[]{2,3,5,6,7,8,9,0,23,5};


    public Sort getCurrentSort() {
        return currentSort;
    }

    public void QuickS(){
        currentSort = new QuickSort();
    }
    public void HeapS(){ currentSort =  new HeapSort();
    }

    public int[] Sort(){
        int newCollection[] = new int[10];
        newCollection = currentSort.sort(tab);
        return newCollection;
    }


}



