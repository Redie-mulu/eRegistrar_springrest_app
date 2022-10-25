package edu.miu.cs.cs425.eregistrarapp.service;

import edu.miu.cs.cs425.eregistrarapp.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
    public  User saveUser(User user);
    public  User getUserById(Integer userId);
}
