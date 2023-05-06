package ru.deadhead.springboot.dao;

import ru.deadhead.springboot.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    List<User> listUsers();

    User findById(Long id);

    User update(User user);

    void deleteUser(User user);

}
