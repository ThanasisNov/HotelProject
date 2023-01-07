package api;

import java.io.*;

public class EditFile {

    public boolean remove(String line_to_remove) throws FileNotFoundException
    {
        //String[] splited = line_to_edit.split(",");
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
