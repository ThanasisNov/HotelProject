package api;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class ExistsTest {

    @Test
    public void existstest() throws FileNotFoundException {
        Exists ex = new Exists();
        Assert.assertTrue(ex.exists("Heritage"));

    }

}