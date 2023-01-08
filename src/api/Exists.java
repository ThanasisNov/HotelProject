package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * class to check if a name of an accommodation already exists
 */
public class Exists {


    /**
     *
     * @param name of the accommodation
     * @return true if the accommodation with this name exists, false if  it doesn't
     * @throws FileNotFoundException
     */
    public boolean exists(String name) throws FileNotFoundException
    {
        boolean temp = false;
        String str;
        Scanner myReader = new Scanner(new File("AddBase.txt"));

        while(myReader.hasNext())
        {
            str = myReader.nextLine();
            String[] splited = str.split(",");
            String nm = splited[1];
            if(nm.equals(name))
            {
               temp = true;
            }
        }
        return temp;
    }
}
