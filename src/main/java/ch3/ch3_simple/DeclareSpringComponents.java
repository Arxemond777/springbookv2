package ch3.ch3_simple;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.load("classpath:META-INF/spring/ch3-simple-app-context-xml.xml");
        ctx.load("classpath:META-INF/spring/ch3-simple-app-context-annotation.xml");
        ctx.refresh();

        MessageRenderer messageRenderer = ctx.getBean("messageRenderer",
            MessageRenderer.class);

        messageRenderer.render();
    }
}

