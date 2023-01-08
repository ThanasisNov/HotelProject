package api;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class SubmitsTest {

    @Test
    public void searchSubmit1() throws FileNotFoundException {
        Submits test1= new Submits();
String[] temp= test1.SearchSubmit("Heritage");
assertEquals(temp[1],"Heritage");

    }
}