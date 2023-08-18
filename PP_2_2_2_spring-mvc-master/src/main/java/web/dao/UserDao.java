package web.dao;

import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User findUserById(Long id);

    public void saveUser(User user);

    public void update(Long id, User updateduser);

    @Transactional
    public void delete(Long id);
}
