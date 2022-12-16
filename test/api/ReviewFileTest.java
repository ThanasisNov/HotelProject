package api;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReviewFileTest {
 ReviewFile check= new ReviewFile();
    @Test
    public void addR() throws IOException {
       byte[] array = new byte[7]; // length is bounded by 7
       new Random().nextBytes(array);
       String generatedString = new String(array, Charset.forName("UTF-8"));
        check.AddR(generatedString,"Nikolaos","Heritage","Teleio",5);
    }
   @Test
   public void searchReview() throws FileNotFoundException {
      ArrayList wow = new ArrayList<>();
      wow.add("Heritage Hotel   Isaia3 Greece 52100 5");
      assertEquals(check.SearchReviewofUser("Wow"),wow);

   }
    @Test
    public void getmo() throws IOException {

       assertTrue(check.getmo()==0);
    }



    @Test
    public void searchReviewforUser() {
    }

    @Test
    public void alreadyExists() {
    }

    @Test
    public void deleteReview() {
    }

    @Test
    public void getAverage() {
    }

    @Test
    public void searchReviewofUser() {
    }
}