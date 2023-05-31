package Pract7;

import Pract7.facade.Facade;
import Pract7.flyweight.SpectralType;
import Pract7.flyweight.StarFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade example: ");
        Facade facade = new Facade();
        facade.init();
        System.out.println();

        System.out.println("Flyweight example: ");
        StarFactory starFactory = new StarFactory();
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0 -> starFactory.createStar(SpectralType.M);
                case 1 -> starFactory.createStar(SpectralType.G);
                case 2 -> starFactory.createStar(SpectralType.A);
            }
        }
    }
}