package Pract6.abstractFactory;

public class IceCreamFactoryB implements IceCreamFactory {
    @Override
    public IceCreamCone createIceCreamCone() {
        return new IceCreamConeB();
    }

    @Override
    public IceCreamSundae createIceCreamSundae() {
        return new IceCreamSundaeB();
    }
}