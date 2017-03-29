package ch5_AOP.page_228_SIMPLE_CUT_static_pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut
{
    @Override
    public boolean matches(Method method, Class<?> cls) {
        return ("foo".equals(method.getName()));
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter()
        {
            public boolean matches(Class<?> cls) {
                return (cls == BeanOne.class);
            }
        };
    }
}
