public class Maker implements IteratorMaker{
    private Iterator i;

    public Maker(Iterator i) {
        this.i = i;
    }


    public Iterator iterator() {
        return i;
    }
}
