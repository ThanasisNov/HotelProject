package api.start;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

public class App {

    static String[] functions = {"Προσθήκη καταχώρησης", "Επεξεργασία καταχώρησης", "Διαγραφή καταχώρησης", "Εμφάνιση profile"};
    static UserBase u = new UserBase();

    private static Scanner check;


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
                    }
                } catch (Exception e) {

                    found = false;
                }
        return found;
    }
    /*
    OLD
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
    }*/
    }
