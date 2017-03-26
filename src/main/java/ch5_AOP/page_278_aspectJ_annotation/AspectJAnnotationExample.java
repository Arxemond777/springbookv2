package ch5_AOP.page_278_aspectJ_annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJAnnotationExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch5_AOP/page_278_aspectJ_annotation/app-context-xml.xml");
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        myBean.execute();
    }
}
