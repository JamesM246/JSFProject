package sparta.com.jmm.services;

import sparta.com.jmm.components.User;

import javax.inject.Named;

@Named
public class LoginService {

    public String validateUser(User user) {
        if(user.getUsername().equals("Jmaguire") && user.getPassword().equals("password")) return "welcome";
        return "signIn";
    }
}
