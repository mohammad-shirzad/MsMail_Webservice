package dao;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserDao extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
}
