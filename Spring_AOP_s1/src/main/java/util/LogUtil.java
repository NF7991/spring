package util;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogUtil {
    public static void start(Method method,Object ... objects){
        System.out.println(method.getName()+"方法正在执行：参数是："+ Arrays.asList(objects));

    }
    public static void stop(Method method,Object ... objects){
        System.out.println(method.getName()+"方法执行结束,结果是："+Arrays.asList(objects));
    }

    public static void logException(Method method,Exception e){
        System.out.println(method.getName()+"方法抛出异常" + e.getMessage());

    }

    public static void logFinally(Method method){
        System.out.println(method.getName()+"方法执行结束....");

    }
}
