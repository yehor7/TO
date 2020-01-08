public class QuickSort implements Sort{

    public QuickSort(){
        System.out.println("Quick sort");
    }

    public int[] sort(int[] e) {
        quick(e, 0, e.length-1);
        return e;
    }

    private void quick(int[] tab, int start, int end){
        int i,j,x,y;
        i = start;
        j = end;
        x = tab[(start+end)/2];
        do{
            while((tab[i] < x) && (i < end)) i++;
            while ((x<tab[j]) && (j> start)) j--;
            if(i<=j){
                y = tab[i];
                tab[i]=tab[j];
                tab[j]=y;
                i++;
                j--;
            }
        }while (i<=j);
        if(start < j)quick(tab,start,j);
        if(i<end)quick(tab, i, end);

    }

}
