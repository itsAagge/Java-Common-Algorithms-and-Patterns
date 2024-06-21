package InterfaceAndAbstractClass;

public class Lasercanon extends Gun implements EnergyBeam{
    public Lasercanon(int skade, double reloadTime) {
        super(skade, reloadTime);
    }

    @Override
    public int rækkevidde() {
        return 50;
    }
}
