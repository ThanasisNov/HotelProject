package api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Submits {
    private static Scanner check;

    /**
     * @param name the name of the place you are searching for
     * @return A String array which contains all the elements of the hotel-apartment-m.
     * @throws FileNotFoundException
     */
    public String[] SearchSubmit(String name) throws FileNotFoundException {
        String[] bookings = null;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("AddBase.txt"));
            String line = reader.readLine();

            while (line != null) {
                bookings = line.split(",");
                if (bookings[1].equals(name)) {
                    break;
                }
                line = reader.readLine();

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookings;
    }



}