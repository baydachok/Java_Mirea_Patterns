package Pract7.flyweight;

public class Star {

    private SpectralType spectralType;

    public Star() {
        System.out.println("New star created");
        this.spectralType = SpectralType.G;
    }

    public Star setSpectralType(SpectralType spectralType) {
        this.spectralType = spectralType;
        return this;
    }
}