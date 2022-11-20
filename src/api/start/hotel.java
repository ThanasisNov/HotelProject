package api.start;

public class hotel {
    private String name;
    private String hoteltype;
    private String area;
    private String description;

    /**
     * Setters and Getters of the class
     */
    void setName(String name)
    {
        this.name=name;
    }
    void setHoteltype(String hoteltype)
    {
        this.hoteltype=hoteltype;
    }
    void setArea(String area)
    {
        this.area=area;
        
    }
    void setDescription(String description)
    {
        this.description=description;
    }
    String getName()
    {
        return name;
    }
    String getHoteltype()
    {
        return hoteltype;
    }
    String getArea()
    {
        return area;
    }
    String getDescription()
    {
        return description;
    }
}
