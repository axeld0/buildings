package Model;

public class MultiGymnasium implements  Building, SportsFacility {

    private int type;
    private double surface;

    public MultiGymnasium (int type, double surface)
    {
        this.type = type;
        this.surface = surface;
    }

    @Override
    public double getBuildingSurface() {
        return surface;
    }


    /**
     * Type of building. If 1, is a multigym.
     * @return
     */
    @Override
    public int getTypeOfBuilding() {
        return type;
    }

    @Override
    public String toString() {
        return "MultiGymnasium{" +
                "type=" + type +
                ", surface=" + surface +
                "}\n";
    }
}
