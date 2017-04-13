package ch10_check_formated_and_type.page_489_property_editor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PropEditorExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch10_check_formated_and_type/page_489_property_editor/prop-editor-app-context.xml");
//        ctx.load("classpath:/Users/urijglusenkov/InteliJ/springBook2/src/main/resources/META-INF/spring/ch10_check_formated_and_type/page_489_property_editor/prop-editor-app-context.xml");
        ctx.refresh();

        Contact chris = ctx.getBean("chris", Contact.class);
        System.out.println("Chris info: " + chris);

        Contact myContact = ctx.getBean("myContact", Contact.class);
        System.out.println("My contact info: " + myContact);
    }
}
