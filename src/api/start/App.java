package api.start;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static String[] functions = {"Προσθήκη καταχώρησης", "Επεξεργασία καταχώρησης", "Διαγραφή καταχώρησης", "Εμφάνιση profile"};
    static UserBase u = new UserBase();

    private static Scanner check;

public ArrayList Search(String name, String type, String loc, String view, String bathroom , String wash,  String en,String heat, String Wifi, String area,String outside,String parking)
{
    String realname="";
    String tempUsername = "";
    String tempType = "";
   String temploc="";
    String tempview="";
    String tempWifi="" ;
    String tempparking="";
    String tempbathroom="";
    String temparea="" ;
    String tempwash="";
    String tempen="";
    String tempheat="";
    String tempoutside="";
    BufferedWriter bw = null;
  ArrayList<String>hotels=new ArrayList<>();


    try {


        check = new Scanner(new File("AddBase.txt"));
        check.useDelimiter("[,\n]");
        while (check.hasNext() ) {
            realname=check.next();
            tempUsername = check.next();
            tempType = check.next();
            temploc=check.next();
            String tempde=check.next();
            tempview=check.next();
            tempbathroom=check.next();
            tempwash=check.next();
            tempen=check.next();
            tempheat=check.next();
            tempWifi=check.next();
            temparea=check.next();
            tempoutside=check.next();
            tempparking=check.next();
            if ((tempUsername.trim().equals(name) ||name.equals("")) &&
                    (tempType.trim().equals(type)||type.equals("") )&&
                    (temploc.trim().equals(loc)||loc.equals(""))
                    &&(tempview.trim().equals(view)||view.equals(""))
                    &&(temparea.trim().equals(area)||area.equals(""))
                    &&(tempen.trim().equals(en)||area.equals(""))&&
                    (tempbathroom.trim().equals(bathroom)||bathroom.equals(""))
                    &&     (tempwash.trim().equals(wash)||wash.equals(""))
                    &&(tempheat.trim().equals(heat)||heat.equals(""))
                    &&(tempoutside.trim().equals(outside)||outside.equals(""))
                    &&(tempparking.trim().equals(parking)||parking.equals(""))
                    &&(tempwash.trim().equals(wash)||wash.equals(""))
                    &&(tempWifi.trim().equals(Wifi)||Wifi.equals("")))
            {
              hotels.add(tempUsername+","+tempview+","+temploc);
            System.out.println("FOUND");
            }
            check.nextLine();

        }
    } catch (Exception e) {
System.out.println("Error");
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
     * @return το πρόγραμμα για να γίνει καινούργια εγγραφή χρήστη ζητάει username(μοναδικό),password,name,surname,type(Α ή Β) .Αν όλα τα στοιχεία που έδωσε πληρούν τις
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

        br.write(n+","+name+","+ tp +"," + loc + "," + des +","+ fac.getView() + ","+ fac.getBathroom() + "," + fac.getClothes() + ","+ fac.getEntertainment() + "," + fac.getHeat() +","+ fac.getWifi() + "," + fac.getKitchen() + "," + fac.getOutside() + "," + fac.getParking() );
        br.newLine();
        System.out.println(fac.getOutside());
        System.out.println(fac.getParking());

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

