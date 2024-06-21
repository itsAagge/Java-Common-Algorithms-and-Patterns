package InterfaceAndAbstractClass;

public class SMG extends Gun implements Bullet{
    public SMG(int skade, double reloadTime) {
        super(skade, reloadTime);
    }

    @Override
    public int magazinStørrelse() {
        return 30;
    }

    @Override
    public String typeAmmo() {
        return "Ild";
    }
}
