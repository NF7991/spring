package util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogUtil {

    /**
     * 通知注解有以下几种类型:
     * @Before:前置通知，在方法之前完成
     * @After：后置通知，在方法执行之后执行
     * @AfterReturing：返回通知：在返回结果之后运行
     * @AfterThrowing：异常通知，出现异常的时候使用
     * @Around：环绕通知
     *
     *
     * 在方法的参数列表中不要随便添加参数值，会有异常信息
     *
     * 切入点表达式：
     *  最精确的匹配方式：
     *      public Integer com.mashibing.service.MyCalculator.add(Integer,Integer)
     *  在实际的生产环境中，更多的时候使用通配符的方式
     *      *：
     *   1、可以用来匹配一个或者多个字符
     *      execution( public Integer com.mashibing.service.MyCalculator.*(Integer,Integer)
     *   2、匹配任意类型的参数，只能匹配一个
     *      execution( public Integer com.mashibing.service.M*Calculator.*(Integer,*))
     *   3、*在进行匹配的时候只能匹配一层路径，不能匹配多层
     *   4、*不能够匹配访问修饰符，如果不确定访问修饰符是什么，可以直接省略不写
     *      execution( Integer com.mashibing.service.MyCalculator.*(Integer,*))
     *   5、返回值可以使用*来代替
     */

    @Before("execution(public Integer service.*.*.M*Calculator.*.*(Integer,*))")
    public static void start(){
        System.out.println("方法正在执行：参数是：");

    }

    @AfterReturning("execution(public Integer service.*.*.M*Calculator.*(Integer,Integer))")
    public static void stop(){
        System.out.println("方法执行结束,结果是：");
    }

    @AfterThrowing("execution(public Integer service.*.*.M*Calculator.*(Integer,Integer))")
    public static void logException(){
        System.out.println("方法抛出异常" );

    }
    @After("execution(public Integer service.*.*.M*Calculator.*(Integer,Integer))")
    public static void logFinally(){
        System.out.println("方法执行结束....");

    }


}
