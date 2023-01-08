package api;

import java.util.Scanner;

public class Feedback {
    private String feedback;
    private int rating;



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
