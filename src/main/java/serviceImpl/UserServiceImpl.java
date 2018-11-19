package serviceImpl;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User saveNewUser(User user) {
        try {
            return userDao.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean findUserByEmail(String email) {
        try {
            User user = userDao.findUserByEmail(email);
            if (user == null) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
