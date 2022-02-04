import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class NewJavaClassTester {
    NewJavaClass name1, name2;

    @Before
    public void initTestCases() {
        name1 = new NewJavaClass("Aleksa");
        name2 = new NewJavaClass("Bob");
    }

    @Test
    public void testDoubleName() {
        assertEquals("Aleksa", name1.getName());
        name1.doubleName();
        assertEquals("AleksaAleksa", name1.getName());
        name1.doubleName();
        assertEquals("AleksaAleksaAleksaAleksa", name1.getName());
    }

    @Test
    public void testRemoveFirst() {
        assertEquals("Bob", name2.getName());
        name2.removeFirstLetterOfName();
        assertEquals("ob", name2.getName());
        name2.removeFirstLetterOfName();
        assertEquals("b", name2.getName());
    }

    @Test
    public void testRemoveLast() {
        assertEquals("Bob", name2.getName());
        name2.removeLastLetterOfName();
        assertEquals("Bo", name2.getName());
        name2.removeLastLetterOfName();
        assertEquals("B", name2.getName());
    }
}
