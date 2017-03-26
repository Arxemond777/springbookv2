package ch4_detailed_configure_spring.page_180_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigXMLExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new 
            ClassPathXmlApplicationContext("classpath:META-INF/spring/ch4_detailed_configure_spring/page_180_java_config/app-context-xml.xml");

        MessageRenderer renderer = 
            ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
