package api;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * A class which implements functions necessary for the program
 */
public class App {
    private static Scanner check;
    private static final ArrayList<Integer> found = new ArrayList<>();

    /**
     *
     * @param x A given String
     * @return Returns a String that contains a different type of ",".
     */
    public  String CommaChanger(String x)
{
    char[] myNameChars = x.toCharArray();
    int i=0;
    while(i<x.length())
    {
        Character test=x.charAt(i);
        if(test.equals(','))
        {
            myNameChars[i]=Character.toChars(885)[0];
        }
        i++;
    }
    x = String.valueOf(myNameChars);
    return x;
}
    /**
     * Creates a string from a specific number(lineNumber) which points to a line of AddBase.txt  and to the end of the string it adds the average grade of
     * the hotel.
     * @param lineNumber the line of the  AddBase.txt
     * @return the line of the  AddBase.txt you need in String form
     */
    public String StringMaker(int lineNumber) throws IOException {
        String line;
        String realname = null;
        String tempname = "";
        String temph = null;
        String tempa = null;
        String tempm = null;
        String tempAddress = null;
        String tempCity = null;

        String tempPost = null;
        try (Stream<String> lines = Files.lines(Paths.get("AddBase.txt"))) {
            line = lines.skip(lineNumber).findFirst().get();
        }
        Scanner check = new Scanner(line);
        check.useDelimiter("[,\n]");
        while (check.hasNext()) {
            realname = check.next();
            tempname = check.next();
            temph = check.next();
            tempa = check.next();
            tempm = check.next();
            tempAddress = check.next();
            tempCity = check.next();
            tempPost = check.next();
            check.nextLine();
        }
        ReviewFile test= new ReviewFile();
        ArrayList<String[]> check3 =test.SearchReview(realname,tempname);
        String temp=String.format("%.2f", test.getmo());
        if(temph.equals("empty")) temph="";     if(tempa.equals("empty")) tempa="";     if(tempm.equals("empty")) tempm="";     if(tempAddress.equals("empty")) tempAddress="";
        if(tempCity.equals("empty")) tempCity="";      if(tempPost.equals("empty")) tempPost="";
        return tempname + " " + temph + " " + tempa + " " + tempm + " " + tempAddress + " " + tempCity + " " + tempPost+" "+temp;
    }


    /**
     *
     * @return A List that returns the elements which were found from the criteria given in Search.
     */
    public ArrayList getfound() {
        return found;
    }

    /**Creates an ArrayList which contains all the  elements that were found in AddBase.txt.
     * @param name           hotel name
     * @param h              hotel
     * @param a              apartment
     * @param m              maisonette
     * @param address
     * @param city
     * @param post
     * @param pool
     * @param beach
     * @param sea
     * @param port
     * @param mount mountain
     * @param road
     * @param hair
     * @param Tv
     * @param fire
     * @param air
     * @param fullheat
     * @param washmach
     * @param dryer
     * @param wif wife
     * @param ethe           ethernet
     * @param Fridge
     * @param oven
     * @param micro  microwave
     * @param cook
     * @param plates
     * @param dishwash
     * @param caffe
     * @param balcony
     * @param yard
     * @param privateparking
     * @param roadparking
     * @return An Arraylist which contains all the  elements that were found in AddBase.txt.
     */
    public ArrayList Search(String name, String h, String a, String m, String address, String city, String post, String pool, String beach, String sea, String port, String mount, String road
            , String hair, String Tv, String fire, String air, String fullheat, String washmach, String dryer, String wif, String ethe, String Fridge, String oven, String micro
            , String cook, String plates, String dishwash, String caffe, String balcony, String yard, String privateparking, String roadparking) {
        found.clear();
        String realname = null;
        String tempname = "";
        String temph = null;
        String tempa = null;
        String tempm = null;
        String tempAddress = null;
        String tempCity = null;
        String tempPost = null;
        String tempDe = null;
        String temppool = null;
        String tempbeach = null;
        String tempsea = null;
        String tempport = null;
        String tempmount = null;
        String temproad = null;
        String temphair = null;
        String tempTv = null;
        String tempfire = null;
        String tempair = null;
        String tempfullheat = null;
        String tempwashmach = null;
        String tempdryer = null;
        String tempwif = null;
        String tempethe = null;
        String tempFridge = null;
        String tempoven = null;
        String tempcook = null;
        String tempplates = null;
        String tempdishwash = null;
        String tempcaffe = null;
        String tempmicro = null;
        String tempbalcony = null;
        String tempyard = null;
        String tempprivateparking = null;
        String temproadparking = null;
        BufferedWriter bw = null;
        ArrayList<String> hotels = new ArrayList<>();

        try {
            int lines = 0;
            check = new Scanner(new File("AddBase.txt"));
            check.useDelimiter("[,\n]");
            while (check.hasNext()) {
                realname = check.next();
                tempname = check.next();
                temph = check.next();
                tempa = check.next();
                tempm = check.next();
                tempAddress = check.next();
                tempCity = check.next();
                tempPost = check.next();
                tempDe = check.next();
                temppool = check.next();
                tempbeach = check.next();
                tempsea = check.next();
                tempport = check.next();
                tempmount = check.next();
                temproad = check.next();
                temphair = check.next();
                tempTv = check.next();
                tempfire = check.next();
                tempair = check.next();
                tempfullheat = check.next();

                tempwashmach = check.next();
                tempdryer = check.next();
                tempwif = check.next();
                tempethe = check.next();
                tempFridge = check.next();
                tempoven = check.next();
                tempmicro = check.next();
                tempcook = check.next();
                tempplates = check.next();
                tempdishwash = check.next();
                tempcaffe = check.next();


                tempbalcony = check.next();
                tempyard = check.next();
                tempprivateparking = check.next();

                temproadparking = check.next();


                if ((tempname.trim().equals(name) || name.equals("empty")) &&
                        (temph.trim().equals(h) || h.equals("empty")) &&
                        (tempa.trim().equals(a) || a.equals("empty"))
                        && (tempm.trim().equals(m) || m.equals("empty"))
                        && (temppool.trim().equals(pool) || pool.equals("empty"))
                        && (temproad.trim().equals(road) || road.equals("empty")) &&
                        (tempbeach.trim().equals(beach) || beach.equals("empty"))

                        && (tempport.trim().equals(port) || port.equals("empty"))
                        && (tempmount.trim().equals(mount) || mount.equals("empty"))
                        && (tempsea.trim().equals(sea) || sea.equals("empty"))
                        && (temphair.trim().equals(hair) || hair.equals("empty"))
                        && (tempwif.trim().equals(wif) || wif.equals("empty"))
                        && (tempwashmach.trim().equals(washmach) || washmach.equals("empty")) &&

                        (tempdryer.equals(dryer) || dryer.equals("empty")) &&
                        (tempethe.equals(ethe) || ethe.equals("empty")) &&
                        (tempFridge.equals(Fridge) || Fridge.equals("empty")) &&
                        (tempoven.trim().equals(oven) || oven.equals("empty"))
                        && (tempcook.trim().equals(cook) || cook.equals("empty"))
                        && (tempplates.trim().equals(plates) || plates.equals("empty"))
                        && (tempdishwash.trim().equals(dishwash) || dishwash.equals("empty"))
                        && (tempcaffe.trim().equals(caffe) || caffe.equals("empty"))
                        && (tempmicro.trim().equals(micro) || micro.equals("empty"))
                        && (tempbalcony.trim().equals(balcony) || balcony.equals("empty"))

                        && (tempyard.trim().equals(yard) || yard.equals("empty"))
                        && (tempprivateparking.trim().equals(privateparking) || privateparking.equals("empty"))
                        && (temproadparking.trim().equals(roadparking) || roadparking.equals("empty"))
                        && (tempTv.trim().equals(Tv) || Tv.equals("empty"))
                        && (tempfire.trim().equals(fire) || fire.equals("empty"))
                        && (tempfullheat.trim().equals(fullheat) || fullheat.equals("empty"))
                        && (tempair.trim().equals(air) || air.equals("empty")) && (tempethe.trim().equals(ethe) || ethe.equals("empty"))
                        && (tempAddress.trim().equals(address) || address.equals("empty")) && (tempCity.trim().equals(city) || city.equals("empty")) && (tempPost.equals(post) || post.equals("empty"))
                        && !(name.equals("empty") && h.equals("empty") && a.equals("empty") && m.equals("empty") && pool.equals("empty") && road.equals("empty") && beach.equals("empty") && port.equals("empty") && mount.equals("empty") &&
                        sea.equals("empty") && hair.equals("empty") && wif.equals("empty") && washmach.equals("empty") && dryer.equals("empty") && ethe.equals("empty") && Fridge.equals("empty") && oven.equals("empty")
                        && cook.equals("empty") && plates.equals("empty") && dishwash.equals("empty") && caffe.equals("empty") && micro.equals("empty") && balcony.equals("empty") && yard.equals("empty") && privateparking.equals("empty")
                        && roadparking.equals("empty") && city.equals("empty") && address.equals("empty") && post.equals("empty"))) {
                    String tempview = temppool + "," + tempbeach + "," + tempsea + "," + tempport + "," + tempmount + "," + temproad;
                    hotels.add(tempname + "," + tempview + "," + tempCity);
                    found.add(lines);
                }
                check.nextLine();
                lines++;

            }
        } catch (Exception e) {

        }

        return hotels;

    }


    /**
     *
     * @param username
     * @param password
     * @return Check if the user exists.If that's the case returns true else it returns false.
     */
    public boolean Login(String username, String password) {
        String tempUsername = "";
        String tempPassword = "";

        BufferedWriter bw = null;

       App c= new App();
        boolean found = false;

        try {


            check = new Scanner(new File("UserBase.txt"));
            check.useDelimiter("[,\n]");
            while (check.hasNext() && !found) {

                tempUsername = check.next();
                tempPassword = check.next();

                if (tempUsername.trim().equals(username) && tempPassword.trim().equals(password)) {
                    found = true;

                }
                check.nextLine();

            }
        } catch (Exception e) {

            found = false;
        }
        return found;
    }

    /**
     * It asks for a username,password,name,surname and type.If the username that is given does not already exists and the type of the account is A or B then it creates
     * a new user in UserBase.txt.
     * @param username
     * @param password
     * @param name
     * @param surname
     * @param type
     * @return true if the  variables given meet the requirements else it returns false.
     */
    public boolean Register(String username, String password, String name, String surname, String type) throws IOException {
        String tempUsername = "";
        String tempPassword = "";

        BufferedWriter bw = null;


        boolean found = true;


        check = new Scanner(new File("UserBase.txt"));
        check.useDelimiter("[,\n]");
        while (check.hasNext() && found) {
            tempUsername = check.next();
            if (tempUsername.trim().equals(username)) {
                found = false;
            }
            check.nextLine();
        }


        if (found) {

            if (!(type.equals("A") || type.equals("B"))) {

                return false;
            }

            File file = new File("UserBase.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.newLine();
            br.write(username + "," + password + "," + name + "," + surname + "," + type);

            br.close();
            fr.close();

        }

        return found;
    }

    /**Search for the type of the user.
     * @param username όνομα χρήστη για σύνδεση
     * @return  the type of user A(normal) or B(owner)
     */
    public String Type(String username) {
        String tempUsername = "";
        String tempPassword = "";
        String tempName = "";
        String tempSurname = "";
        String tempType = "";
        BufferedWriter bw = null;


        boolean found = false;

        try {


            check = new Scanner(new File("UserBase.txt"));
            check.useDelimiter("[,\n]");
            while (check.hasNext() && !found) {

                tempUsername = check.next();
                tempPassword = check.next();
                tempName = check.next();
                tempSurname = check.next();
                tempType = check.next();
                if (tempUsername.trim().equals(username)) {
                    found = true;
                }


            }
        } catch (Exception e) {

            found = false;
        }
        return tempType.trim();
    }

    /**Idk if we use that one xD
     * @param name
     * @param tp   type
     * @param loc  location
     * @param des  description
     * @param fac  object of room
     * @param n
     * @throws IOException
     */
    public boolean add(String name, String tp, String loc, String des, room fac, String n) throws IOException {


        File file = new File("AddBase.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);

        try {
            br.write(n + "," + name + "," + tp + "," + loc + "," + des + "," + fac.getView() + "," + fac.getBathroom() + "," + fac.getClothes() + "," + fac.getEntertainment() + "," + fac.getHeat() + "," + fac.getWifi() + "," + fac.getKitchen() + "," + fac.getOutside() + "," + fac.getParking() + ",");

        } catch (IOException e) {
           return false;
        }
        br.newLine();


        br.close();
        fr.close();
        return true;

    }


}
