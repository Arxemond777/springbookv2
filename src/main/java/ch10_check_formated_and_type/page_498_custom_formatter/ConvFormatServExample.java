package ch10_check_formated_and_type.page_498_custom_formatter;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

public class ConvFormatServExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch10_check_formated_and_type/page_498_custom_formatter/conv-format-service-app-context.xml");
        ctx.refresh();

        Contact chris = ctx.getBean("chris", Contact.class);

        System.out.println("Contact info: " + chris);

        ConversionService conversionService = ctx.getBean("conversionService", ConversionService.class);
        System.out.println("Birthdate of contact is : " +
                conversionService.convert(chris.getBirthDate(), String.class));
    }
}
