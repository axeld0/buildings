package Model;

import Model.Building;

import java.util.ArrayList;

public class test {

    ArrayList<Building> buildingList;

    public test(){
        buildingList = new ArrayList<>();
    }

    public void addBuilding (Building b)
    {
        buildingList.add(b);
    }


    /**
     * IT SHOWS AN LIST OF BUILDINGS
     * @param buildingListString a string
     */
    public String displayBuildings (String buildingListString)
    {
        StringBuilder buildingListStringBuilder = new StringBuilder(buildingListString);
        for ( Building b : buildingList)
        {
            buildingListStringBuilder = "Type of building (1 = Sports Facility/ 2 = Office Building) : " +
        return buildingListString;
    }

}
