package jar.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FuncList<T> {

    private List<T> list;

    public FuncList () {
        list = new ArrayList<T>();
    }
    public FuncList (T element) {
        list = new ArrayList<T>();
        list.add(element);
    }
    public FuncList<T> add(T singleEntry) {
        return new FuncList<T>(singleEntry);
    }

    public int size() {
        return list.size();
    }
}
