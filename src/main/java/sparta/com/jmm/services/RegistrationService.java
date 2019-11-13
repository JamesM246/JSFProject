package sparta.com.jmm.services;

import sparta.com.jmm.components.User;

import javax.inject.Named;

@Named
public class RegistrationService {

    public String registerUser(User user) {
        if(user.getUsername().equals("Jmaguire") && user.getPassword().equals("password")) return "welcome";
        return "signIn";
    }
}
