import Model.*;

public class Main {
    public static void main(String[] args) {

        test newTest = new test();

        Building multiGym1 = new MultiGymnasium(1,456.65 );
        Building multiGym2 = new MultiGymnasium(1, 123.1);
        Building multiGym3 = new MultiGymnasium(1, 45.4);
        Building office1 = new OfficeBuilding(2, 65.45,65 );
        Building office2 = new OfficeBuilding(2, 12.12, 74);

        newTest.addBuilding(multiGym1);
        newTest.addBuilding(multiGym2);
        newTest.addBuilding(multiGym3);
        newTest.addBuilding(office1);
        newTest.addBuilding(office2);


        String buildingList = "";
        System.out.println(newTest.displayBuildings(buildingList));


    }

}