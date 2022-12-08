package api;

import java.util.Scanner;

public class Feedback {
    private String feedback;
    private int rating;
    private int numofwords = 0;


    public Feedback() {
        feedback = "";
        rating = -1;
    }
    public void Amazing(String feedback,int rating)
    {
        this.feedback=feedback;
        this.rating=rating;
    }

    Scanner forinput = new Scanner(System.in);

    public void setFeedback() {
        String answer;

        while(feedback.equals("")) {
            System.out.println("Καταχωρήστε την αξιολόγηση σας: ");
            feedback = forinput.next();
            if (feedback.equals(""))
            {
                System.out.println("Η καταχώρηση κειμένου αξιολόγησης είναι υποχρεωτική!");
            }
            else if(feedback.length()>10)
            {
                System.out.println("Έχετε ξεπεράσει το όριο χαρακτήρων , θα θέλατε να καταχωρήσετε νέο κείμενο(Πληκτρολογήστε: ΝΑΙ) ή να τερματήσετε την διαδικασία(Πληκτρολογήστε: ΟΧΙ) ;");
                answer = forinput.next();
                if(answer.equals("OXI"))
                {
                    System.exit(0);
                }
                else if(answer.equals("ΝΑΙ"))
                {
                    feedback = "";
                }
            }
        }
    }

    public String getFeedback() {
        return feedback;
    }

    public void setRating() {
        System.out.println("Give us a rating: ");
        while (rating < 0 || rating > 5) {
            rating = forinput.nextInt();
            if (rating == -1) {
                System.out.println("Giving a rating is necessary!");
            } else if (rating < 1 || rating > 5) {
                System.out.println("Rating scale: 1-5");
            }
        }
    }


    public int getRating() {
        return rating;
    }
}
