package webservice;

import com.google.gson.Gson;
import model.entity.User;
import model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserProvider {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/save_user", method = RequestMethod.POST)
    public int saveUser(@RequestParam(name = "user") String json) {
        try {
            Gson gson = new Gson();
            User user = gson.fromJson(json, User.class);
            return userService.saveEntity(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
