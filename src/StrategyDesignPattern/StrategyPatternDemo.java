package StrategyDesignPattern;

import java.util.Scanner;

interface ShippingStrategy {
    double calculateShippingCost(double weight);
}

class StandardShipping implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5.00;
    }
}

class ExpressStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10.00;
    }
}

class ShippingContext {

    private ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShipping(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}


public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShippingContext shippingContext = new ShippingContext();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2 , 1 for standard shipping, 2 for express shipping");
        int choice = sc.nextInt();

        if (choice == 1) {
            shippingContext.setShippingStrategy(new StandardShipping());
            double amount1 = shippingContext.calculateShipping(10);
            System.out.println(amount1);
        } else if (choice == 2) {
            shippingContext.setShippingStrategy(new ExpressStrategy());
            double amount2 = shippingContext.calculateShipping(10);
            System.out.println(amount2);
        }
    }
}
