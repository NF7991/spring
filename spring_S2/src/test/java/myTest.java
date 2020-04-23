import com.NF.bean.Address;
import com.NF.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        /**
        * 根据bean标签来获取对象
        * */
 //       Person person = context.getBean("person",Person.class);
//        Person person2 = context.getBean("person",Person.class);
//        System.out.println(person);
//        //单例模式 结果true
//        System.out.println(person == person2);

        /**
         * 根据bean的类型来获取对象
         * 配置文件中有多个相同类型的对象，将无法完成工作 注意注意！
         */
//        Person bean = context.getBean(Person.class);
//        System.out.println(bean);

        /**
         * 当需要从容器中获取对象的时候，最好要保留无参构造方法，因为底层的实现是反射
         *  Class clazz = Person.class;
         *  Object obj = clazz.newInstance();默认调用无参的构造方法，此方法已经被弃用
         *  Object obj = class.getDeclaredConstructor().newInstance()
         */


//        Person person2 = context.getBean("person2", Person.class);
//        System.out.println(person2);
//
//        Person person3 = context.getBean("person3", Person.class);
//        System.out.println(person2);

//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);
//
//        Person person5 = context.getBean("person5", Person.class);
//        System.out.println(person5);

//        Person person6 = context.getBean("person6", Person.class);
//        System.out.println(person6);

//        Address address2 = context.getBean("address2", Address.class);
//        System.out.println(address2);

//        Person son = context.getBean("son", Person.class);
//        System.out.println(son);
//        Person parent = context.getBean("parent", Person.class);
//        System.out.println(parent);

//        Person person2 = context.getBean("person2", Person.class);
//        Person person3 = context.getBean("person2", Person.class);
//        System.out.println(person2 == person3);

//        Person person3 = context.getBean("person3", Person.class);
//        System.out.println(person3);
//
//        Person person4 = context.getBean("person4", Person.class);
//        System.out.println(person4);


//        Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
//        System.out.println(myFactoryBean);

//        Person person5 = context.getBean("person5", Person.class);
//        System.out.println(person5);
//        //销毁对象
//        ((ClassPathXmlApplicationContext)context).close();


//        DruidDataSoure dataSource = context.getBean("dataSource1", DruidDataSoure.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnecttion());

        Person person = context.getBean("person", Person.class);
        System.out.println(person);


    }

}
