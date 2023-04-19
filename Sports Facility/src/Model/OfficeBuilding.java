package Model;

public class OfficeBuilding implements Building
{
    private int type ;
    private double surface;
    private int offices;



    public  OfficeBuilding ()
    {
        type = 0;
        surface = 0;
        offices =0;
    }
    public OfficeBuilding (int type, double surface, int offices)
    {
        this.type = type;
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

    public int getTypeOfBuilding (){return type;}

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "type=" + type +
                ", surface=" + surface +
                ", offices=" + offices +
                "}\n";
    }
}
