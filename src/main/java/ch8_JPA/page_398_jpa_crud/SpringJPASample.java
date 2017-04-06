package ch8_JPA.page_398_jpa_crud;

import java.util.List;
import java.util.Date;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringJPASample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch8_JPA/page_398_jpa_crud/app-context-annotation.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("jpaContactService", ContactService.class);

        /** 397 findAll | findWithDetail & findById не писал, если надо, то где-т на 397-402*/
        /*List<Contact> contacts = contactService.findAll();

        for (Contact contact : contacts)
            System.out.println(contact);*/

        /** 403 displayAllContactSummary написание собственного запроса, типа query builder */
        ContactSummaryUntypeImpl contactSummaryUntype = ctx.getBean("contactSummaryUntype", ContactSummaryUntypeImpl.class);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        contactSummaryUntype.displayAllContactSummary();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&" + System.lineSeparator());

//        List<Contact> contacts = contactService.findAllByNativeQuery();
    }
}
