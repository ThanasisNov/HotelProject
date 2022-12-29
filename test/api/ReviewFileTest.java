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
      wow.add("Heritage Hotel   Gout3 Beligrad 32423 3");
      assertEquals(check.SearchReviewofUser("Thanasis"),wow);

   }
    @Test
    public void getmo() throws IOException {
 check.SearchReview("Nikolaos","Heritage");
 System.out.println(check.getmo());
       assertTrue(check.getmo()==5.0);
    }



    @Test
    public void searchReviewforUser() throws FileNotFoundException {
      String[] wow=  check.SearchReviewforUser("Nikolaos","Heritage","Thanasis");
      assertTrue(wow[0].equals("Thanasis") && wow[1].equals("Nikolaos")&& wow[2].equals("Heritage"));
    }


    @Test
    public void alreadyExists() throws FileNotFoundException {
        assertTrue(!check.AlreadyExists("provider1","Heritage","user1"));
    }

    @Test
    public void deleteReview() throws IOException {
     /*   byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        check.AddR(generatedString,"Nikos","Xeli","Perfect",3);
       assertTrue( check.DeleteReview("Nikos","Xeli",generatedString));*/


    }

    @Test
    public void getAverage() throws FileNotFoundException {
        check.SearchReviewofUser("Thanasis");
        System.out.println(check.getAverage());
        assertTrue(check.getAverage()==4.6);
    }

    @Test
    public void searchReviewofUser() throws FileNotFoundException {
      ArrayList wow=  check.SearchReviewofUser("Thanasis");
     System.out.println(wow);
    }
}