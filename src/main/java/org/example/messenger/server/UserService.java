package org.example.messenger.server;

import org.example.messenger.models.User;

import java.util.List;

public class UserService {
    private final UserDaoImpl userDao = new UserDaoImpl();

    public UserService() {
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }

    public User findUserByUsernameAndPassword(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username, password);
    }
    public List<String> findAllUsernames() {
        return userDao.findAllUsernames();
    }
    public List<String> findAllUsernamesExceptCurrent(String username) {
        return userDao.findAllUsernamesExceptCurrent(username);
    }
}
