package jar.datastructures;

import junit.framework.TestCase;

/**
 *
 */
public class TestList extends TestCase {

    public void testCreateFuncList() {
        FuncList<String> funcList = new FuncList<String>();
    }

    public void testCreateSingleEntryFuncList() {
        FuncList<String> funcList = new FuncList<String>();

        funcList = funcList.add("SingleEntry");

        assertEquals(1, funcList.size());
    }
}
