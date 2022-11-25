package api.start;

import javax.swing.*;

public class room extends hotel {
    private  String view,bathroom,clothes,entertainment,heat,wifi,kitchen,outside,parking;

    /**
     Setters and Getters for the variables of the class.
     */
    public void setView(String viewText)
    {
        this.view=view;
    }
    public void setBathroom(String bathroom)
    {
        this.bathroom=bathroom;
    }
    public void setClothes(String clothes)
    {
        this.clothes=clothes;
    }
    public void setEntertainment(String entertainment)
    {
        this.entertainment=entertainment;
    }
    public  void setHeat(String heat)
    {
        this.heat=heat;
    }
    public void setWifi(String wifi)
    {
        this.wifi=wifi;
    }
    public void setKitchen(String kitchen)
    {
        this.kitchen=kitchen;
    }
    public void setOutside(String outside)
    {
        this.outside=outside;
    }
    public void  setParking(String parking)
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
