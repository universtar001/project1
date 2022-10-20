package cn.itcast.user.service;

import cn.itcast.user.dao.UserDao;
import cn.itcast.user.domain.User;

//user的业务逻辑层
public class Userservice {
    private UserDao userDao = new UserDao();
    public void regist(User user) throws UserException {
        /*
        * 校验用户名查询，是否存在，若存在则抛出异常
        * */
        User __user = userDao.findByUsername(user.getUsername());
        if(__user!=null)throw new UserException("用户名已被注册");
    }
}
