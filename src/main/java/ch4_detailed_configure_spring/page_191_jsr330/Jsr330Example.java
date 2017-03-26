package ch4_detailed_configure_spring.page_191_jsr330;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Example
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch4_detailed_configure_spring/page_191_jsr330/app-context-annotation.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
