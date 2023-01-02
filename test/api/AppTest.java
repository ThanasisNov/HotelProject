package api;

import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This test can be deleted
 */

public class AppTest {
   App test = new App();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMethod() {
        assertTrue(true);

    }

    @Test
    public void StringMaker() throws IOException {


        assertEquals("TheraHotel" + " " + "Hotel" + " " + " " + " " + "Era32" + " " + "Paris" + " " + "21324" + " " + "2.00", test.StringMaker(2));
    }

    @Test
    public void Search() {

        ArrayList wow = new ArrayList<>();
        wow.add("Heritage,empty,empty,Sea,empty,empty,empty,Beligrad");
        assertEquals(wow,test.Search("Heritage","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty"));
    }


    @Test
    public void getfound() {
     ArrayList foundtest= new ArrayList();
     foundtest.add(0);
test.Search("Heritage","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty");
     assertEquals(test.getfound(),foundtest);

    }

    @Test
    public void CommaTest() {
   assertTrue(!",".equals(test.CommaChanger(",")));

    }

    @Test
    public void login() {
     assertEquals(test.Login("user1","password1"),true);
    }

    @Test
    public void register() throws IOException {
     byte[] array = new byte[7]; // length is bounded by 7
     new Random().nextBytes(array);
     String generatedString = new String(array, Charset.forName("UTF-8"));
     assertTrue(test.Register(generatedString,"123","Athanasios","Novatsidis","A"));

    }

    @Test
    public void type() {
     assertEquals(test.Type("user1"),"A");//in case of error check type .trim in return
     assertEquals(test.Type("provider1"),"B");
    }

    @Test
    public void add() throws IOException {
     byte[] array = new byte[1]; // length is bounded by 7
     new Random().nextBytes(array);
     String generatedString = new String(array, Charset.forName("UTF-8"));
     room test1= new room();
     assertTrue(test.add(generatedString,"1","2","3,",test1,"5"));
    }

}