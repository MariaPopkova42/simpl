package ru.sapteh.service;

import org.hibernate.SessionFactory;
import ru.sapteh.dao.Dao;
import ru.sapteh.dao.impl.UserDaoImpl;
import ru.sapteh.model.User;

import java.util.List;

public class UserService {
    private final Dao<User, Integer> userDao;

    public UserService(SessionFactory factory) {
        this.userDao = new UserDaoImpl(factory);
    }

    public User findById(int id) {
        return userDao.findById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.save(user);
    }

    public void delete(User user) {
        userDao.save(user);
    }
}