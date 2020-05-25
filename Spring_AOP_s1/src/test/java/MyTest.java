import myinter.Myinterface;
import org.junit.Test;
import proxy.CalculatorProxy;
import service.Calculator;
import service.MyCalculator;
import service.MyInterface;
import service.MySubClass;

import java.lang.reflect.Proxy;

public class MyTest {

    @Test
    public void test01() throws NoSuchMethodException {
//        MyCalculator myCalculator = new MyCalculator();
//
//        System.out.println(myCalculator.add(1, 2));
//        System.out.println(myCalculator.sub(1, 2));
//        System.out.println(myCalculator.mul(1, 2));
//        System.out.println(myCalculator.div(1, 2));

        Calculator calculator = (Calculator) CalculatorProxy.getProxy(new MyCalculator());
        calculator.add(1,2);
        calculator.sub(1,2);
        calculator.mul(1,2);
        calculator.div(1,2);
        System.out.println(calculator.getClass());
//        System.out.println("-----------------------");
//        MyInterface proxy = (MyInterface) CalculatorProxy.getProxy(new MySubClass());
//        proxy.show(100);
    }
}
