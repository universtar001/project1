package cn.itcast.user.dao;

import cn.itcast.user.domain.User;
import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    public void findByUsername() {
        UserDao userDao = new UserDao();

        User user = userDao.findByUsername("userTest");

        System.out.println(user);
    }

    @Test
    public void addUser() throws DocumentException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUsername("userTest");
        user.setPassword("password");
        userDao.addUser(user);
    }
}