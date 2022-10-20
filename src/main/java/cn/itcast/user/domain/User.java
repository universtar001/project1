package cn.itcast.user.domain;
/*是用户实体类
* javabean：
* 1.标准的java类 类必须用public修饰
* 2.必须提供空参构造器
* 3.成员变量用private
* 4.提供公共的setter和getter
* */
//改年 ： 成员变量和属性区别：属性的定义规则是：set/get方法名，去掉set/get后，将剩余部分首字母小写得到的字符串就是这个类的属性。
//功能是用来封装数据

/*三个方法  setProperty() getProperty()/  和populate
populate(obj,Map map) 将map集合对应的键值对信息封装到对应 javabean对象中

*
* */
public class User {
    private String username;
    private String password;
    private String verifyCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                '}';
    }
}
