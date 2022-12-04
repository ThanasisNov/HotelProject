package api.start;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    static String[] functions = {"Προσθήκη καταχώρησης", "Επεξεργασία καταχώρησης", "Διαγραφή καταχώρησης", "Εμφάνιση profile"};
    static UserBase u = new UserBase();

    private static Scanner check;
   private static ArrayList<Integer>found= new ArrayList<>();
   public ArrayList getfound()
   {
       return found;
   }

    /**
     *
     * @param lineNumber
     * @return
     * @throws IOException
     */
   public  String ListMaker(int lineNumber) throws IOException {
   String line;
       String realname=null;
       String tempname="";
       String temph=null;
       String tempa=null;
       String tempm=null;
       String tempAddress=null;
       String tempCity=null;

       String tempPost=null;
       try (Stream<String> lines = Files.lines(Paths.get("AddBase.txt"))) {
           line = lines.skip(lineNumber).findFirst().get();
       }
       Scanner check= new Scanner(line);
       check.useDelimiter("[,\n]");
       while (check.hasNext() ) {
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
      String wow=tempname+" "+temph+" "+tempa+" "+tempm+" "+tempAddress+" "+tempCity+" "+tempPost;

       return wow;
   }
    /**
     *
     * @param name
     * @param h
     * @param a
     * @param m
     * @param loc
     * @param pool
     * @param beach
     * @param sea
     * @param port
     * @param mount
     * @param road
     * @param hair
     * @param Tv
     * @param fire
     * @param air
     * @param fullheat
     * @param washmach
     * @param dryer
     * @param wif
     * @param ethe
     * @param Fridge
     * @param oven
     * @param cook
     * @param plates
     * @param dishwash
     * @param caffe
     * @param micro
     * @param balcony
     * @param yard
     * @param privateparking
     * @param roadparking
     * @return
     */
    public ArrayList Search(String name, String h,String a,String m, String address,String city,String post, String pool,String  beach,String sea,String port,String mount,String road
        ,String hair,String Tv,String fire,String air ,String fullheat,String washmach,String dryer,String wif,String ethe,String Fridge,String oven,String micro
        ,String cook,String plates,String dishwash,String caffe,String balcony,String yard,String privateparking,String roadparking)
{
   found.clear();
    String realname=null;
    String tempname="";
    String temph=null;
    String tempa=null;
    String tempm=null;
    String tempAddress=null;
    String tempCity=null;
    String tempPost=null;
    String tempDe =null;
    String temppool=null;
    String  tempbeach=null;
    String tempsea=null;
    String tempport=null;
    String tempmount=null;
    String temproad=null;
    String temphair=null;
    String tempTv=null;
    String tempfire=null;
    String tempair=null ;
    String tempfullheat=null;
    String tempwashmach=null;
    String tempdryer=null;
    String tempwif=null;
    String tempethe=null;
    String tempFridge=null;
    String tempoven=null;
    String tempcook=null;
    String tempplates=null;
    String tempdishwash=null;
    String tempcaffe=null;
    String tempmicro=null;
    String tempbalcony=null;
    String tempyard=null;
    String tempprivateparking=null;
    String temproadparking=null;
    BufferedWriter bw = null;
  ArrayList<String>hotels=new ArrayList<>();


    try {
int lines=0;
        check = new Scanner(new File("AddBase.txt"));
        check.useDelimiter("[,\n]");
        while (check.hasNext() ) {
            realname=check.next();
            tempname = check.next();
            temph = check.next();
            tempa=check.next();
            tempm=check.next();
            tempAddress=check.next();
            tempCity=check.next();
            tempPost=check.next();
            tempDe=check.next();
            temppool=check.next();
            tempbeach=check.next();
            tempsea=check.next();
            tempport=check.next();
            tempmount=check.next();
            temproad=check.next();
            temphair=check.next();
            tempTv=check.next();
            tempfire=check.next();
            tempair= check.next();
            tempfullheat = check.next();

            tempwashmach=check.next();
            tempdryer=check.next();
            tempwif=check.next();
            tempethe=check.next();
            tempFridge=check.next();
            tempoven=check.next();
            tempmicro=check.next();
            tempcook=check.next();
            tempplates=check.next();
            tempdishwash=check.next();
            tempcaffe=check.next();


            tempbalcony=check.next();
            tempyard=check.next();
            tempprivateparking=check.next();

            temproadparking=check.next();


System.out.println(caffe);
            if ((tempname.trim().equals(name) ||name.equals(""))&&
                    (temph.trim().equals(h)||h.equals("") )&&
                    (tempa.trim().equals(a)||a.equals(""))
                    &&(tempm.trim().equals(m)||m.equals(""))
                    &&(temppool.trim().equals(pool)||pool.equals(""))
                    &&(temproad.trim().equals(road)||road.equals(""))&&
                    (tempbeach.trim().equals(beach)||beach.equals(""))
                    &&(tempport.trim().equals(port)||port.equals(""))
                    &&(tempmount.trim().equals(mount)||mount.equals(""))
                    &&(tempsea.trim().equals(sea)||sea.equals(""))
                    &&(temphair.trim().equals(hair)||hair.equals(""))
                    &&(tempwif.trim().equals(wif)||wif.equals(""))
                    &&(tempwashmach.trim().equals(washmach)||washmach.equals(""))&&
                    (tempdryer.equals(dryer)||dryer.equals(""))&&
                    (tempethe.equals(ethe)||ethe.equals(""))&&
                    (tempFridge.equals(Fridge)||Fridge.equals(""))&&
                    (tempoven.trim().equals(oven)||oven.equals(""))
                    &&(tempcook.trim().equals(cook)||cook.equals(""))
                    &&(tempplates.trim().equals(plates)||plates.equals(""))
                    &&(tempdishwash.trim().equals(dishwash)||dishwash.equals(""))
                    && (tempcaffe.trim().equals(caffe)||caffe.equals(""))
                    &&(tempmicro.trim().equals(micro)||micro.equals(""))
                    &&(tempbalcony.trim().equals(balcony)||balcony.equals(""))
                    &&(tempyard.trim().equals(yard)||yard.equals(""))
                    &&(tempprivateparking.trim().equals(privateparking)||privateparking.equals(""))
                    &&(temproadparking.trim().equals(roadparking)||roadparking.equals(""))
                    &&(tempTv.trim().equals(Tv)||Tv.equals(""))
                    &&(tempfire.trim().equals(fire)||fire.equals(""))
                    &&(tempfullheat.trim().equals(fullheat)||fullheat.equals(""))
                    &&(tempair.trim().equals(air)||air.equals("")) &&( tempethe.trim().equals(ethe)||ethe.equals(""))
            &&!(name.equals("")&&h.equals("")&&a.equals("")&&m.equals("")&&pool.equals("")&&road.equals("")&&beach.equals("")&&port.equals("")&&mount.equals("")&&
                    sea.equals("")&&hair.equals("")&&wif.equals("")&&washmach.equals("")&&dryer.equals("")&&ethe.equals("")&&Fridge.equals("")&&oven.equals("")
            &&cook.equals("")&&plates.equals("")&&dishwash.equals("")&&caffe.equals("")&&micro.equals("")&&balcony.equals("")&&yard.equals("")&&privateparking.equals("")
            &&roadparking.equals("")))


            {
                System.out.println("33");
                String tempview=temppool +"," +tempbeach+"," +tempsea+"," +tempport+"," +tempmount +","+temproad;
              hotels.add(tempname+","+tempview+","+tempCity);
              found.add(lines);
            }
            check.nextLine();
          lines++;

        }
    } catch (Exception e) {

System.out.println("Error App");
    }
    return hotels;

}
    /**
     * @param username όνομα χρήστη
     * @param password κωδικός χρήστη
     * @return Η κλάση ελέγχει αν υπάρχει όντως ο χρήστης με αυτό το username και password και αν ναι επιστρέφει true διαφορετικά false.
     */
    public boolean Login(String username, String password) {
        String tempUsername = "";
        String tempPassword = "";

        BufferedWriter bw = null;


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
     * @param username όνομα χρήστη
     * @param password κωδικός χρήστη
     * @param name     πραγματικό όνομα
     * @param surname  επίθετο
     * @param type     τύπος λογαριασμού
     * @return το πρόγραμμα για να γίνει καινούργια εγγραφή χρήστη ζητάει username(μοναδικό),password,name,surname,type(Α ή Β)  . Αν όλα τα στοιχεία που έδωσε πληρούν τις
     * προϋποθέσεις τότε προσθέτει τον καινούργιο χρήστη στο UserBase και επιστέφει true για επιβεβαίωση .Διαφορετικά επιστέφει false.
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

    /**
     * @param username όνομα χρήστη για σύνδεση
     * @return επιστρέφει το είδος λογαριασμού του χρήστη δηλαδή Α(κανονικός)  ή Β(πάροχος)
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
        return tempType;
    }

    /**
     *
     * @param name όνομα καταλύματος
     * @param tp τύπος καταλύματος
     * @param loc τοποθεσία καταλύματος
     * @param des περιγραφή καταλύματος
     * @param fac αντικείμενο του room
     * @throws IOException
     */
    public void add(String name, String tp, String loc, String des, room fac,String n) throws IOException {


        File file = new File("AddBase.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);

        br.write(n+","+name+","+ tp +"," + loc + "," + des +","+ fac.getView() + ","+ fac.getBathroom() + "," + fac.getClothes() + ","+ fac.getEntertainment() + "," + fac.getHeat() +","+ fac.getWifi() + "," + fac.getKitchen() + "," + fac.getOutside() + "," + fac.getParking()+",");
        br.newLine();


        br.close();
        fr.close();

    }





    //OLD
    public void LoginSystem(String username ,String password) throws IOException {

        System.out.println();
        String tempUsername="";
        String tempPassword="";
        boolean check3 = true;
        BufferedWriter bw = null;
        while (check3 == true) {
            System.out.println("Καλησπέρα σας,έχετε ήδη λογαριασμό;Αν ΝΑΙ πληκτρολογήστε ΝΑΙ ,διαφορετικά ΟΧΙ");
            Scanner input = new Scanner(System.in);
            String x = input.next();


            if (x.equals("ΝΑΙ")) {


                boolean found =false;

                while(!found) {
                    try {


                        check = new Scanner(new File("UserBase.txt"));
                        check.useDelimiter("[,\n]");
                        while (check.hasNext() && !found) {
                            tempUsername = check.next();
                            tempPassword = check.next();
                            if (tempUsername.trim().equals(username) && tempPassword.trim().equals(password)) {
                                found = true;
                            }
                        }
                    }
                    catch (Exception e)
                    {
                        found=false;
                    }
                    if(!found) {
                        System.out.println("Λάθος κωδικός  ή όνομα χρήστη,θέλετε να ξαναπροσπαθήσετε; ΝΑΙ 'Η ΟΧΙ");
                        x = input.next();
                        if (x.equals("ΟΧΙ")) System.exit(0);
                        System.out.println("Username:");
                        username = input.next();
                        System.out.println("Password:");
                        password = input.next();
                    }

                         }
                System.out.println("Καλησπέρα σας " + username + "!");
                System.out.println("Λειτουργίες:");
                for (String Χ1 : functions) {
                    System.out.println(Χ1);
                }
                System.out.println("Για αποσύνδεση πληκτρολογείστε EXIT");
                String a = input.next();
                if (a.equals("EXIT")) {

                    System.out.println("Αποσύνδεση");
                    continue;
                }
            } else if (x.equals("ΟΧΙ")) {
                System.out.println("Θα θέλατε να εγγραφείτε; ΝΑΙ 'Η ΟΧΙ");
                x = input.next();
                if (x.equals("ΟΧΙ")) System.exit(0);
                System.out.println("Όνομα:");
                String ονομα = input.next();
                System.out.println("Επίθετο:");
                String επιθετο = input.next();
                System.out.println("Username:");
                username = input.next();
                System.out.println("Password:");
              password = input.next();
                System.out.println("Τύπος Λογαριασμού:");
                String type = input.next();

             boolean check2=false;
                do {


                    while (ονομα.isEmpty() || επιθετο.isEmpty() || username.isEmpty() || password.isEmpty() || type.isEmpty()) {
                        if ((ονομα.isEmpty() || επιθετο.isEmpty() || username.isEmpty() || password.isEmpty() || type.isEmpty())) {
                            System.out.println("Όλα τα στοιχεία είναι υποχρεωτικά(για τερματισμό  πληκτρολογείστε ΟΧΙ)");
                            x = input.next();
                            if (x.equals("ΟΧΙ")) System.exit(0);

                        }

                        System.out.println("Όνομα:");
                        ονομα = input.next();
                        System.out.println("Επίθετο:");
                        επιθετο = input.next();
                        System.out.println("Username:");
                        username = input.next();
                        System.out.println("Password:");
                        password = input.next();
                        System.out.println("Τύπος Λογαριασμού:");
                        type = input.next();


                    }

                    boolean found =false;


                        check= new Scanner(new File("UserBase.txt"));
                        check.useDelimiter("[,\n]");
                        while (check.hasNext() && !found) {
                            tempUsername = check.next();

                            if (tempUsername.trim().equals(username) ) {
                                found=true;
                            }


                        }
                  if(found==false) check2=true;
                    if (found==true) {
                        System.out.println("To όνομα χρήστη υπάρχει(για τερματισμό πληκτρολογείστε ΟΧΙ)");
                        System.out.println("Διαφορετικά ξαναδώσε Username");
                        x = input.next();
                        if (x.equals("ΟΧΙ")) System.exit(0);
                        username = x;

                    }

                } while (check2==false);
                u.setUsers(username, password);
                SensitiveData s = new SensitiveData();
                s.setΟνομα(ονομα);
                s.setΕπιθετο(επιθετο);
                s.setΤυπος(type);
                u.info.put(username, s);
                File file = new File("UserBase.txt");
                FileWriter fr = new FileWriter(file, true);

                BufferedWriter br = new BufferedWriter(fr);
                br.newLine();
                br.write(username+","+password+","+ονομα+","+επιθετο+","+type);

                br.close();
                fr.close();


                System.out.println("Η εγγραφή ολοκληρώθηκε");
            } else {
                System.out.println("Error");
                System.exit(0);
            }


        }

        }
    }

