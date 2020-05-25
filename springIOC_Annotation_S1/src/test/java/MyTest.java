import com.NF.controller.PersonController;
import com.NF.service.PersonService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注意点：1.给测试类名字的时候不能定义成Test
 *        2.测试的方法不可由参数，不可有返回值
 */
public class MyTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonController personController = context.getBean("personController", PersonController.class);
//        PersonController personController02 = context.getBean("personController", PersonController.class);

//        System.out.println(personController);
//        System.out.println(personController == personController02);
//        PersonService personService = context.getBean("personService", PersonService.class);
//        System.out.println(personService);
        personController.save();
    }
}
