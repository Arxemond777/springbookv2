package ch4_detailed_configure_spring.page_156_factory_bean_and_factory_method_attributes;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch4_detailed_configure_spring/page_156_factory_bean_and_factory_method_attributes/app-context-xml.xml");
        ctx.refresh();

        MessageDigester digester = (MessageDigester) ctx.getBean("digester");
        digester.digest("Hello World!");
    }
}
