package Patterns.Decorator.condiments;

import Patterns.Decorator.bevarages.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
