package ru.deadhead.springboot.service;


import ru.deadhead.springboot.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    User findUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);

}
