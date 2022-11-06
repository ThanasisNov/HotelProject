package start;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class App {

    static String[] functions = {"Προσθήκη καταχώρησης","Επεξεργασία καταχώρησης","Διαγραφή καταχώρησης","Εμφάνιση profile"};
     static UserBase u = new UserBase();

    public static void main(String[] args) {
        boolean check3=true;
        while(check3==true){
        System.out.println("Καλησπέρα σας,έχετε ήδη λογαριασμό;Αν ΝΑΙ πληκτρολογήστε ΝΑΙ ,διαφορετικά ΟΧΙ");
        Scanner input= new Scanner(System.in);
        String x=input.next();
        if(x.equals("ΝΑΙ")) {

            System.out.println("Username:");
            String username=input.next();
            System.out.println("Password:");
            String password=input.next();

            while(!(u.users.containsKey(username) && u.users.get(username).equals(password))) {
                System.out.println("Λάθος κωδικός  ή όνομα χρήστη,θέλετε να ξαναπροσπαθήσετε; ΝΑΙ 'Η ΟΧΙ");
                x=input.next();
                if(x.equals("ΟΧΙ"))   System.exit(0);
                System.out.println("Username:");
               username=input.next();
                System.out.println("Password:");
                password=input.next();

            }
            System.out.println("Καλησπέρα σας "+username+"!");
            System.out.println("Λειτουργίες:");
            for (String Χ1 : functions) {
                System.out.println(Χ1);
            }
            System.out.println("Για αποσύνδεση πληκτρολογείστε EXIT");
            String a= input.next();
            if(a.equals("EXIT")) {
                System.out.println("Αποσύνδεση");
                continue;
            }
        }
        else if(x.equals("ΟΧΙ")){
            System.out.println("Θα θέλατε να εγγραφείτε; ΝΑΙ 'Η ΟΧΙ");
            x = input.next();
            if (x.equals("ΟΧΙ")) System.exit(0);
            System.out.println("Όνομα:");
            String ονομα = input.next();
            System.out.println("Επίθετο:");
            String επιθετο = input.next();
            System.out.println("Username:");
            String username = input.next();
            System.out.println("Password:");
            String password = input.next();
            System.out.println("Τύπος Λογαριασμού:");
            String type = input.next();


            do {


                while (ονομα.isEmpty() || επιθετο.isEmpty() || username.isEmpty() || password.isEmpty() || type.isEmpty() )

                {
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

                if(u.getUsers().containsKey(username))
                {
                    System.out.println("To όνομα χρήστη υπάρχει(για τερματισμό πληκτρολογείστε ΟΧΙ)");
                    System.out.println("Διαφορετικά ξαναδώσε Username");
                    x = input.next();
                    if (x.equals("ΟΧΙ")) System.exit(0);
                    username = x;
                }
            } while (u.getUsers().containsKey(username));
            u.setUsers(username, password);
            SensitiveData s = new SensitiveData();
            s.setΟνομα(ονομα);
            s.setΕπιθετο(επιθετο);
            s.setΤυπος(type);
            u.info.put(username, s);

         System.out.println("Η εγγραφή ολοκληρώθηκε");
        }
        else {
          System.out.println("Error");
          System.exit(0);
        }
        }
    }
}
