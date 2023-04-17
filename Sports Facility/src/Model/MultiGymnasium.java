package Model;

public class MultiGymnasium implements  Building , SportsFacility{

    @Override
    public double getBuildingSurface() {
        return 1234;
    }


    /**
     * Type of building. If 1, is a multigym.
     * @return
     */
    @Override
    public int getTypeOfBuilding() {
        return 1;
    }
}
