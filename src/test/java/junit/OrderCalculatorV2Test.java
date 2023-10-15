package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderCalculatorV2Test {
    @Test
    public void testCalculateTotal(){
        //given (assumption)
OrderCalculatorV2 testObj = new OrderCalculatorV2();
double itemPrice = 100;
int itemCount = 3;
double taxRate = 0.1;
double discount = 50;
double discountThreshold = 200;
double expectedTotal = (itemPrice * itemCount * (1 * taxRate)) - discount;






        //when (execution of the subject under test)

double actualTotal = testObj.calculateTotal(itemPrice, itemCount, taxRate, discount, discountThreshold);


        //then (verification/assertion come here)
    assertEquals(expectedTotal, actualTotal);

    }

}