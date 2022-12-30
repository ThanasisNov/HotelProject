package api;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class ReviewFile {
private static double mo;

    /**
     *Adds the viriables given to Reviews.txt.
     * @param user user that adds the review
     * @param host the owner of the hotel-apartment-me
     * @param booking the name of the hotel
     * @param review review from  user
     * @param grade grade from user
     * @throws IOException
     */
    public void AddR(String user,String host,String booking,String review,int grade) throws IOException {
        File file = new File("Reviews.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(user+","+host+","+booking+","+review+","+grade);
        br.newLine();
        br.close();
        fr.close();
    }

    /**
     *
     * @return returns the average grade for a specific hotel
     */
    public double getmo()
{
    return  mo;
}

    /**
     *Searches in file Reviews.txt for a line which contains the hostname and hotelname that are given.
     * @param hostname owners name
     * @param hotelname name of the hotel-apartment-me
     * @return an array which contains the reviews for the hotelname of the hostname
     * @throws FileNotFoundException Error
     */
    public ArrayList SearchReview(String hostname,String hotelname) throws FileNotFoundException {
        String[] bookings = null;
        ArrayList<String> review= new ArrayList<>();
        BufferedReader reader;
        boolean check=false;
        double sum=0;
        int oc=0;
        try {
            reader = new BufferedReader(new FileReader("Reviews.txt"));
            String line = reader.readLine();

            while (line != null) {
                bookings=line.split(",");

                if(bookings[2].equals(hotelname) && bookings[1].equals(hostname))
                {
                    oc++;

           review.add(line);

                    sum+=Integer.valueOf(bookings[4]);
                    check=true;
                }
                line = reader.readLine();

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
if(!check)
{
           mo=0;
            return  review;
}
mo=sum/oc;

        return  review;
}

    /**Searches in file Reviews.txt for a line which contains the hostname,hotelname and user that are given.
     *@param hostname The name of the userB that has the hotel-apartment-me
     * @param hotelname The name of the hotel-apartment-me
     * @param user the user who searches  the hotel-apartment-me
     * @return an array which contains the review of user for the hotelname of the hostname
     * @throws FileNotFoundException Error
     */
    public String[] SearchReviewforUser(String hostname,String hotelname,String user) throws FileNotFoundException {
        String[] bookings = null;
        BufferedReader reader;
        boolean check=false;

        try {
            reader = new BufferedReader(new FileReader("Reviews.txt"));
            String line = reader.readLine();

            while (line != null) {
                bookings=line.split(",");

                if(bookings[2].equals(hotelname) && bookings[1].equals(hostname) &&bookings[0].equals(user))
                {

                    check=true;
                    break;
                }
                line = reader.readLine();

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!check)
        {
            int i=0;
            for(String x:bookings)
            {
                bookings[i]="";

                i++;
            }
            return  bookings;
        }


        return  bookings;
    }

    /**
     *
     * @param hostname The name of the userB that has the hotel-apartment-me
     * @param hotelname The name of the hotel-apartment-me
     * @param user the user who searches  the hotel-apartment-me
     * @return  returns true if the name of the user is not found in Reviews ,if that's not the case in returns false
     * @throws FileNotFoundException   Error
     */

    public boolean AlreadyExists(String hostname,String hotelname,String user) throws FileNotFoundException {
        String[] bookings = null;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("Reviews.txt"));
            String line = reader.readLine();

            while (line != null) {
                bookings=line.split(",");

                if(bookings[2].equals(hotelname) && bookings[1].equals(hostname) &&bookings[0].equals(user))
                {
                    return false;
                }
                line = reader.readLine();

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return  true;
    }

    /**
     *
     * @param hostname
     * @param hotelname
     * @param user
     * @return
     * @throws FileNotFoundException
     */
    public boolean DeleteReview(String hostname,String hotelname,String user) throws FileNotFoundException {
        String[] bookings = null;
        BufferedReader reader;
boolean check=false;
        try {
            File fout = new File("Delete.txt");
            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            reader = new BufferedReader(new FileReader("Reviews.txt"));
            BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(fos));
            String line = reader.readLine();

            while (line != null) {


                    pw.write(line);
                    pw.newLine();

                line = reader.readLine();

            }

            reader.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }






        try {
            File fout = new File("Reviews.txt");
            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            reader = new BufferedReader(new FileReader("Delete.txt"));
            BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(fos));
            String line = reader.readLine();

            while (line != null) {

                bookings=line.split(",");
                if(bookings[2].equals(hotelname) && bookings[1].equals(hostname) &&bookings[0].equals(user))
                {

                    check=true;
                }
                else {
                    pw.write(line);
                    pw.newLine();
                }
                line = reader.readLine();

            }

            reader.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




        return  check;
    }

private static double average=0;

    /**
     *
     * @return the average grade that user has given to all of his reviews.
     */
     public double getAverage()
    {
        return average;
    }

    /**
     *
     * @param user username
     * @return ArrayList which containts all the reviews of a user
     * @throws FileNotFoundException
     */
    public ArrayList SearchReviewofUser(String user) throws FileNotFoundException {
        String[] bookings = null;
        ArrayList r= new ArrayList<>();
        BufferedReader reader;

        Hashtable<String,String > check=new Hashtable<>();
        double sum=0;
       double oc=0;

        try {
            reader = new BufferedReader(new FileReader("Reviews.txt"));
            String line = reader.readLine();

            while (line != null ) {
                bookings = line.split(",");

                if (bookings[0].equals(user))
                {

                  //System.out.println(bookings[2]+"+"+bookings[4]);
                    check.put(bookings[2],bookings[4]);
                }

line=reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader2;
        try {
            reader2 = new BufferedReader(new FileReader("AddBase.txt"));
            String line1 = reader2.readLine();

            while (line1 != null) {

                String[] temp = line1.split(",");
                //System.out.println(check.toString()+"+"+temp[1] +"-->"+temp.length);
                if (temp.length > 1) {

                    if (check.containsKey(temp[1])) {


                        if (temp[2].equals("empty")) temp[2] = "";
                        if (temp[3].equals("empty")) temp[3] = "";
                        if (temp[4].equals("empty")) temp[4] = "";
                        if (temp[5].equals("empty")) temp[5] = "";
                        r.add(temp[1] + " " + temp[2] + " " + temp[3] + " " + temp[4] + " " + temp[5] + " " + temp[6] + " " + temp[7] + " " + check.get(temp[1]));
                        //System.out.println(bookings[2] + " "+temp[2]+" "+temp[3]+" "+temp[4]+" "+temp[5]+" "+temp[6]+" "+temp[7]+" "+bookings[4]);
                        sum += Integer.valueOf(bookings[4]);
                        oc++;

                    }


                }
                line1 = reader2.readLine();

            }
            reader2.close();
            } catch(IOException e){
                e.printStackTrace();
            }

        if (oc!=0) average=sum/oc;


        return  r;
    }


}