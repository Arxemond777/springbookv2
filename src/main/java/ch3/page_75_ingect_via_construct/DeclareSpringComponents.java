package ch3.page_75_ingect_via_construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch3/page_75/app-context-annotation.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("messageProvider",
            MessageProvider.class);

        System.out.println(messageProvider.getMessage());
    }
}
