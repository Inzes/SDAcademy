package Junit;

public class OrderCalculator {
    public double calculateTotal(double itemPrice, int itemCount, double taxRate, double discount){
        double totalPrice = itemPrice * itemCount;
        // apply tax
        totalPrice *= (1+ taxRate);
        totalPrice -= discount;

        return totalPrice;
        }

    public static void main(String[] args) {
        OrderCalculator calculator = new OrderCalculator();
        double total = calculator.calculateTotal(100, 3, 0.1, 50);
        System.out.println("Total price: " + total);

    }
    }

