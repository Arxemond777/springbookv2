package ch4_detailed_configure_spring.page_146_bean_name_aware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNamePrinterExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch4_detailed_configure_spring/page_146_bean_name_aware/app-context-xml.xml");
        ctx.refresh();

        BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinter");
        bean.someOperation();
    }
}
