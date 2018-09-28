package webservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.entity.User;
import model.service.UserService;
import org.json.JSONString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/user")
public class UserProvider {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/save_user")
    public int saveUser(@RequestParam(name = "user") String string) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(string, User.class);
            return userService.saveEntity(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
