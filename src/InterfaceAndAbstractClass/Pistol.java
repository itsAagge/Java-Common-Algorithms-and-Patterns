package InterfaceAndAbstractClass;

public class Pistol extends Gun implements Bullet{
    public Pistol(int skade, double reloadTime) {
        super(skade, reloadTime);
    }

    @Override
    public int magazinStørrelse() {
        return 12;
    }

    @Override
    public String typeAmmo() {
        return "Eksplosiv";
    }
}
