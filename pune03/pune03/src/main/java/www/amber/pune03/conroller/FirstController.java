package www.amber.pune03.conroller;

import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.amber.pune03.model.UserData;

import www.amber.pune03.service.UserServiceIMP;

@Controller
public class FirstController {

    @Autowired
    UserServiceIMP service;

   

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/adduser")
    public String getUser(@ModelAttribute UserData user) {
      service.addUser(user);
         
        return "addUser";
    }

    @GetMapping("/showUser")
    public String show() {
        return "showUser";

    }

    @GetMapping("/showUser2")
    public String show2(Model model) {
      
        List<UserData> user =service.getUserData();
        model.addAttribute("userdata",user);
         System.out.println(user);       
        return "showUser";

    }

       

}
