package ch3.page_73_inject_via_method_install;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch3/page_73/app-context-xml.xml");
        ctx.refresh();

        MessageRenderer messageRenderer = ctx.getBean("messageRenderer",
            MessageRenderer.class);

        messageRenderer.render();
    }
}
