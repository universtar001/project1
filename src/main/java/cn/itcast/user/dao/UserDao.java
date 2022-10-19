package cn.itcast.user.dao;

import cn.itcast.user.domain.User;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

import javax.sql.rowset.spi.XmlWriter;
import java.io.*;

//数据类
//user的业务逻辑层
public class UserDao {
    private String path = "user.xml";//依赖数据文件
    public User findByUsername(String username){
        SAXReader reader = new SAXReader();
        /*
        * 1.得到Document
        * 2.Xpath查询
        * */
        try {
            Document doc = reader.read(path);
            Element ele =(Element)doc.selectSingleNode("//user[@username='"+username+
                    "']");
            //通过Xpath查询得到Element
            // "//"为无限深度查询,
            // user为查询对象，[]内表示条件 @username表示查询属性
            if(ele == null)
                return null;
            User user = new User();
            String attrusername=ele.attributeValue("username");
            String attrpassword=ele.attributeValue("password");
            user.setUsername(attrusername);
            user.setPassword(attrpassword);
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void addUser(User user)  {
        /*1.得到 document
        2.通过 document 得到 root 元素！＜users＞
        3.使用参数 user，转发成 element 对象
        4.把 element 添加到 root 元素中 利用Document对象的getRootElement()方法获取根节点
        5.保存 document
        6.得到 document
        7.得到根元素
        8.通过根元素创建新元素*/
        
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(path);
            Element root =doc.getRootElement();
            Element userele=root.addElement("user"); //给根元素添加一个user
            userele.addAttribute("username",user.getUsername());
            userele.addAttribute("password",user.getPassword());
            /*
            * 保存文档
            * */
            OutputFormat format = new OutputFormat("\t",true);//缩进字符，是否换行  是
            format.setTrimText(true);//删除原有换行 缩进

            XMLWriter  writer ;
            try {
                FileOutputStream fos = new FileOutputStream(path);
                OutputStreamWriter out = new OutputStreamWriter(fos,"UTF-8");
                writer = new XMLWriter(out,format);
                writer.write(doc);//保存doc对象
                writer.close();
            } catch (Exception e) {//不管什么异常 都抛runtime避免给上层造成麻烦
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
