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
     */
    public String displayBuildings ()
    {
       String displayB = "";
        for ( Building b : buildingList) {

            displayB+= b.toString();

        }
        return  displayB;
    }

}
