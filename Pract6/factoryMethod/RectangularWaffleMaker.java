package Pract6.factoryMethod;

public class RectangularWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new RectangularWaffle();
    }
}