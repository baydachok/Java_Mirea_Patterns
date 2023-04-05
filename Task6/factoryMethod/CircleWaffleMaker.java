package Task6.factoryMethod;

public class CircleWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new CircleWaffle();
    }
}