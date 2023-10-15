package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Example3 {
    @Test

    public void testAssertEquals(){
        assertEquals(64, 2*32); //PASS
        assertEquals(1, 2); //FAIL
    }

    @Test
    public void testAssertTrueFalse(){
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not Hello"));

    }
    @Test
    public void testArrayEqual(){
        int[] first = {1, 2, 3};
        int[] second = {4,5,6};
        assertArrayEquals(first, second, "Arrays are not equals");
    }

    @Test

    public void testAssertNull(){
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSameForObjects(){
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        assertSame(c1, c2);
    }
//TODO investigate "Java String Pool"
    @Test
    public void testAssertSameForString(){
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);
    }
}
