package ch4_detailed_configure_spring.page_181_java_config_message_provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSimpleExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new 
            AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer renderer = 
            ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
