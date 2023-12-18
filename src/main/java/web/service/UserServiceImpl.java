package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDAO;

    public UserServiceImpl(UserDao userDAO) {

        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void saveUser(User user) {

        userDAO.saveUser(user);
    }

    @Override
    public User showUser(long id) {

        return userDAO.showUser(id);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {

        userDAO.removeUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {

        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void updateUser(User user) {

        userDAO.updateUser(user);
    }
}
