package org.example.messenger.server;

import org.example.messenger.models.*;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);
    public User findUserByUsernameAndPassword(String username, String password);
    public User findUserByUsername(String username);
    public void updateUser(User user);
    public List<String> findAllUsernames();

    public List<String> findAllUsernamesExceptCurrent(String username);
}
