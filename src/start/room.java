package start;

public class room {
    private String name;
    private String hoteltype;
    private String area;
    private String description;
    private  String view,bathroom,clothes,entertainment,heat,wifi,kitchen,outside,parking;

    /**
     Setters and Getters for the variables of the class.
     */
    void setView(String view)
    {
        this.view=view;
    }
    void setBathroom(String bathroom)
    {
        this.bathroom=bathroom;
    }
    void setClothes(String clothes)
    {
        this.clothes=clothes;
    }
    void setEntertainment(String entertainment)
    {
        this.entertainment=entertainment;
    }
    void setHeat(String heat)
    {
        this.heat=heat;
    }
    void setWifi(String wifi)
    {
        this.wifi=wifi;
    }
    void setKitchen(String kitchen)
    {
        this.kitchen=kitchen;
    }
    void setOutside(String outside)
    {
        this.outside=outside;
    }
    void  setParking(String parking)
    {
        this.parking=parking;
    }

    String getView()
    {
        return view;
    }
    String getBathroom()
    {
        return bathroom;
    }
    String getClothes()
    {
        return  clothes;
    }
    String getEntertainment()
    {
        return entertainment;
    }
    String getHeat()
    {
        return heat;
    }
    String getWifi()
    {
        return wifi;
    }
    String getKitchen()
    {
        return kitchen;
    }
    String  getOutside()
    {
        return outside;
    }
    String  getParking()
    {
        return parking;
    }
}
