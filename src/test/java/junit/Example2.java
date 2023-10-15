package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example2 {
    @Test
    public void testAdd(){
        //given
        Calculator testObj = new Calculator();
        int expectedResult = 8;
        //when
        int actualResult = testObj.add(5, 3);

        //then
        assertEquals(actualResult, expectedResult);
    }

}
