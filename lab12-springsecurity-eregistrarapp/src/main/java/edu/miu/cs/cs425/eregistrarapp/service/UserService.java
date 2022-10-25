package edu.miu.cs.cs425.eregistrarapp.service;

import edu.miu.cs.cs425.eregistrarapp.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;

@Transactional
public interface UserService {
    public List<User> getAllUsers();
    public  User saveUser(User user);
    public  User getUserById(Integer userId);
}
