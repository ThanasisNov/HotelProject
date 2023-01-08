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
   public void searchReview() throws FileNotFoundException {
        String tline=check.SearchReview("provider1","Heritage").get(0).toString();
         String[] test=tline.split(",");
      assertEquals(test[2],"Heritage");

   }
    @Test
    public void getmo() throws IOException {
 check.SearchReview("provider1","Heritage");
       assertTrue(check.getmo()==2.0);
    }



    @Test
    public void searchReviewforUser() throws FileNotFoundException {
      String[] wow=  check.SearchReviewforUser("provider1","Heritage","user1");
      assertTrue(wow[0].equals("user1") && wow[1].equals("provider1")&& wow[2].equals("Heritage"));
    }


    @Test
    public void alreadyExists() throws FileNotFoundException {
        assertTrue(!check.AlreadyExists("provider1","Heritage","user1"));
    }

    @Test
    public void AddandDeleteReview() throws IOException {
       byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        check.AddR("test","Nikos","Xeli","Perfect",3);
       assertTrue( check.DeleteReview("Nikos","Xeli","test"));


    }

    @Test
    public void getAverage() throws FileNotFoundException {
        check.SearchReviewofUser("user1");
        assertTrue(check.getAverage()==2.5999999046325684);
    }

    @Test
    public void searchReviewofUser() throws FileNotFoundException {
      ArrayList wow=  check.SearchReviewofUser("user1");
     assertTrue(wow.get(0).equals("Heritage Hotel   Gout3 Beligrad 32423 2"));
    }
}