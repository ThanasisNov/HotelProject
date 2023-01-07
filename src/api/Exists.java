package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exists {
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
