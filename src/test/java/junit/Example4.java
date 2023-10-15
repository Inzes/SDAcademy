package junit;

import org.junit.jupiter.api.*;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Example4 {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Run before all tests");

    }


    @BeforeEach
    public void setUp(){
        System.out.println("Run before each test");
    }

    @AfterAll
    public static void tearDownAfterClass(){
        System.out.println("Run after all tests");
    }
@AfterEach

public void tearDown(){
    System.out.println("Run after each tests");

}


    @Test
    public void first(){
        System.out.println("Implementation of the first test");
        assertTrue(1 != 0);


    }
    @Test
    public void second(){
        System.out.println("Implementation of the second test");
        assertTrue(1 != 0);

    }
}
