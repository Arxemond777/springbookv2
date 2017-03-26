package ch5_AOP.page_272_aop_namespace;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopNamespaceExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch5_AOP/page_272_aop_namespace/app-context-xml.xml");
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        myBean.execute();
    }
}
