import Model.MultiGymnasium;
import Model.SportsFacility;

public class Main {
    public static void main(String[] args) {

        SportsFacility newMultiGym = new MultiGymnasium();

        int i1 = newMultiGym.getTypeOfBuilding();
        if(i1 == 1)
        {
            System.out.println("This building is a multi gymnasium.");
        }
        int surface = newMultiGym.getBuildingSurface();
        System.out.println("this Building has [" + surface + "] m2.");
    }

}