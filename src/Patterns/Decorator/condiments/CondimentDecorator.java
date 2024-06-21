package Patterns.Decorator.condiments;


import Patterns.Decorator.bevarages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public abstract String getDescription();
}
