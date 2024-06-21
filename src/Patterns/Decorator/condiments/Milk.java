package Patterns.Decorator.condiments;

import Patterns.Decorator.bevarages.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Milk";
    }
}
