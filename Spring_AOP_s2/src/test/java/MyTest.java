import myinter.Myinterface;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import proxy.CalculatorProxy;
import service.Calculator;
import service.MyCalculator;
import service.MyInterface;
import service.MySubClass;
import service.impl.MyCalculator2;

import java.lang.reflect.Proxy;

public class MyTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01() throws NoSuchMethodException {
//        MyCalculator myCalculator = new MyCalculator();
//
//        System.out.println(myCalculator.add(1, 2));
//        System.out.println(myCalculator.sub(1, 2));
//        System.out.println(myCalculator.mul(1, 2));
//        System.out.println(myCalculator.div(1, 2));

//        Calculator calculator = (Calculator) CalculatorProxy.getProxy(new MyCalculator());
//        calculator.add(1,2);
//        calculator.sub(1,2);
//        calculator.mul(1,2);
//        calculator.div(1,2);
//        System.out.println(calculator.getClass());

//        System.out.println("-----------------------");
//        MyInterface proxy = (MyInterface) CalculatorProxy.getProxy(new MySubClass());
//        proxy.show(100);


    }
    @Test
    public void test02() throws NoSuchMethodException{

        MyCalculator calculator = context.getBean(MyCalculator.class);
        calculator.add(1,1);
        calculator.sub(1,1);
        calculator.show(1,1.0);
        System.out.println(calculator.getClass());


    }

    @Test
    public void test03() throws NoSuchMethodException {
        MyCalculator2 mycalculator2 = context.getBean("myCalculator2", MyCalculator2.class);
        mycalculator2.add(1,2);
    }
}
