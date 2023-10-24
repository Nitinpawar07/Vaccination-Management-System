package www.amber.pune03.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import www.amber.pune03.model.UserData;



public interface UserDataInterface extends JpaRepository<UserData, Integer> {

    public UserData save(UserData user);
    
}
 