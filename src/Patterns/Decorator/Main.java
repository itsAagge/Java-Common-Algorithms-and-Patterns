package Patterns.Decorator;

import Patterns.Decorator.bevarages.Beverage;
import Patterns.Decorator.bevarages.DarkRoast;
import Patterns.Decorator.bevarages.Espresso;
import Patterns.Decorator.condiments.Mocha;
import Patterns.Decorator.condiments.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println();
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

}
