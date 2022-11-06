package start;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contais all the users
 *
 */
public class UserBase {
    static HashMap<String,String> users = new HashMap<>();
    static HashMap<String,SensitiveData> info = new HashMap<>();




    void setUsers(String name,String surname)
    {
      users.put(name,surname);
    }




  HashMap getUsers()
    {
       return  users;
    }

}
