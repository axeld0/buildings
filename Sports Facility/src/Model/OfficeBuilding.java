package Model;

public class OfficeBuilding implements Building
{
    private int typeOfBuilding ;
    private double surface;
    private int offices;



    public  OfficeBuilding ()
    {
        typeOfBuilding = 0;
        surface = 0;
        offices =0;
    }
    public OfficeBuilding (int typeOfBuilding, double surface, int offices)
    {
        this.typeOfBuilding = typeOfBuilding;
        this.surface =  surface;
        this.offices = offices;
    }

    /**
     *
     * @return how much offices it has
     */

    public int getOffices()
    {
        return offices;
    }


    @Override
    public double getBuildingSurface (){
        return surface ;
    }

    public int getTypeOfBuilding (){return typeOfBuilding;}
}
