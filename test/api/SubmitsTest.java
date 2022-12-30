package api;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class SubmitsTest {
Submits t= new Submits();
    @Test
    public void searchSubmit() throws FileNotFoundException {
 String [] test= t.SearchSubmit("Heritage");
 assertEquals(test[2],"Hotel");
    }
}