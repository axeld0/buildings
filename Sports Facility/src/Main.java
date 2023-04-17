import Model.Building;
import Model.MultiGymnasium;
import Model.OfficeBuilding;
import Model.SportsFacility;

public class Main {
    public static void main(String[] args) {

        SportsFacility newMultiGym = new MultiGymnasium();
        Building newOffice = new OfficeBuilding();
        int i1 = newMultiGym.getTypeOfBuilding();
        if(i1 == 1)
        {
            System.out.println("This building is a multi gymnasium.");
        }
        double surface = newMultiGym.getBuildingSurface();
        System.out.println("this Building has [" + surface + "] m2.");

        double offices = newOffice.getBuildingSurface();
        System.out.println("this office has [" + offices + "] offices");
    }

}