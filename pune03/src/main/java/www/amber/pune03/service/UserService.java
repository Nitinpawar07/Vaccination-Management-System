package www.amber.pune03.service;
import java.util.List;
import java.util.Optional;

import www.amber.pune03.model.UserData;

public interface UserService  {


    public void addUser(UserData user);

    public List<UserData> getUserData();

   


    
}
