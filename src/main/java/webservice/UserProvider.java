package webservice;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserProvider {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/save_new_user", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        try {
            if (userService.findUserByEmail(user.getEmail())) {
                return null;
            } else {
                return userService.saveNewUser(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
