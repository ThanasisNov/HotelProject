package start;

import java.util.Scanner;

public class Feedback {
    private String feedback;
    private int rating;
    private int numofwords = 0;


    Feedback() {
        feedback = new String();
        rating = -1;
    }

    Scanner forinput = new Scanner(System.in);

    public void setFeedback() {
        System.out.println("Give us your feedback: ");
        while(feedback.isEmpty()) {
            feedback = forinput.nextLine();
            if (feedback == null)
            {
                System.out.println("Giving a feedback is necessary!");
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
