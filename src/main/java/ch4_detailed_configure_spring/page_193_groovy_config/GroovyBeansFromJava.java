package ch4_detailed_configure_spring.page_193_groovy_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyBeansFromJava {
    public static void main(String[] args) {
        ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
        Contact contact = context.getBean("contact", Contact.class);
        System.out.println(contact);
    }
}
