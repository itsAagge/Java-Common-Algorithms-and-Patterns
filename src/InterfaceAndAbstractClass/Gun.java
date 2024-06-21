package InterfaceAndAbstractClass;

public abstract class Gun {
    private int skade;
    private double reloadTime;

    public Gun(int skade, double reloadTime) {
        this.skade = skade;
        this.reloadTime = reloadTime;
    }
}
