package api;

import java.io.*;

/**
 * class for editing (removing a line and adding a new with all the changes)
 */
public class EditFile {

    /**
     *
     * @param line_to_remove is the line of the file 'AddBase',that we want to remove
     * @return true if the remove has been successfully and false if it hasn't
     * @throws FileNotFoundException
     */
    public boolean remove(String line_to_remove) throws FileNotFoundException
    {
        boolean check = false;
        BufferedReader br;
        try
        {
            File file = new File("Edit.txt");
            FileOutputStream fos = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            br = new BufferedReader(new FileReader("AddBase.txt"));
            BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(fos));
            String line = br.readLine();

            while (line != null) {


                  pw.write(line);
                  pw.newLine();
                line = br.readLine();

            }

            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("AddBase.txt");
            FileOutputStream fos = new FileOutputStream(file);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            br = new BufferedReader(new FileReader("Edit.txt"));
            BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(fos));
            String line = br.readLine();

            while (line != null) {

                //bookings=line.split(",");
                if(line.equals(line_to_remove))
                {
                    check=true;
                }
                else {
                    pw.write(line);
                    pw.newLine();
                }
                line = br.readLine();

            }

            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return check ;
    }

}
