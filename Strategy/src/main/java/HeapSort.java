public class HeapSort implements Sort{

    public HeapSort(){
        System.out.println("Heap sort");
    }


    public int[] sort(int[] e) {
        int n = e.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heap(e, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = e[0];
            e[0] = e[i];
            e[i] = temp;

            heap(e, i, 0);
        }
        return e;
    }

    private void heap(int[] tab, int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && tab[l] > tab[largest])
            largest = l;

        if (r < n && tab[r] > tab[largest])
            largest = r;

        if (largest != i)
        {
            int swap = tab[i];
            tab[i] = tab[largest];
            tab[largest] = swap;

            heap(tab, n, largest);
        }
    }

}
