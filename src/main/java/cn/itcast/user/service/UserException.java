package cn.itcast.user.service;
/*
* 自定义一个异常类
* 只是给出父类构造器方法，方便创造对象
* */
public class UserException extends Exception{
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(Throwable cause) {
        super(cause);
    }
}
