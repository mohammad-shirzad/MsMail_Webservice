package service;

import model.User;

public interface UserService {
    User saveNewUser(User user);

    boolean findUserByEmail(String email);
}
