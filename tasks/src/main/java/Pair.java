import java.util.Collection;
import java.util.Iterator;

public class Pair <L, R> {
    L first;
    R second;
    public Pair(L firstElement, R secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public L getFirst() {
        return first;
    }

    public R getSecond()
    {
        return second;
    }

}
