package model.serviceImpl;

import model.dao.BaseDao;
import model.dao.UserDao;
import model.entity.User;
import model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service("UserService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    UserDao userDao;

    public BaseDao getDao() {
        return userDao;
    }

    public int saveUser(User user) {
        return saveEntity(user);
    }

}
