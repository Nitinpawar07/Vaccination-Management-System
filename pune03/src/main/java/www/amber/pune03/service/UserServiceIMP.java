package www.amber.pune03.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.amber.pune03.model.UserData;
import www.amber.pune03.repository.UserDataInterface;

@Service
public class UserServiceIMP implements UserService {

    @Autowired
    UserDataInterface obje;

    @Override
    public void addUser(UserData user) {

        obje.save(user);

    }

    @Override
    public List<UserData> getUserData() {
       return obje.findAll();
    }

   

  
}
