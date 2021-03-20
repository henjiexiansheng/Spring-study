import com.henjie.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: henjie
 * @Date: 2021/2/17 - 02 - 17 - 9:54
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在spring中管理（beans），使用时取出即可，即是控制反转（IOC）
        //控制：谁来控制对象的创建。传统的应用程序对象是由程序本身控制，使用Spring后，对象是由Spring来创建。
        //反转：程序本身不创建对象，而变成被动的接收对象。
        //IOC是一种编程思想，由主动的编程，变为被动的编程
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
