package api;

import com.sun.source.tree.AssertTree;
import org.junit.Before;
import org.junit.Test;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EditFileTest {

    App app = new App();
    room r = new room();
    @Test
    public void edit() throws IOException {
        EditFile editFile = new EditFile();
        app.add("Name","type","location","description",r,"username");
        assertTrue(editFile.remove("username,Name,type,location,description,null,null,null,null,null,null,null,null,null,"));
    }

}