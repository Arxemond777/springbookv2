package ch10_check_formated_and_type.page_492_converter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConvServExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch10_check_formated_and_type/page_492_converter/conv-service-app-context.xml");
        ctx.refresh();

        Contact chris = ctx.getBean("chris", Contact.class);

        System.out.println("Contact info: " + chris);
    }
}
