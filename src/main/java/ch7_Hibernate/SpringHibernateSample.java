package ch7_Hibernate;

import java.util.List;
import java.util.Date;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringHibernateSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch7_Hibernate/app-context-annotation.xml");
        ctx.refresh();

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);

        Contact contact = contactDao.findById(1L);

        contactDao.delete(contact);

//        listContactsWithDetail(contactDao.findAll());
        listContactsWithDetail(contactDao.findAllWithDetail());
    }

    private static void listContactsWithDetail(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts with details:");

        for (Contact contact : contacts) {
            System.out.println(contact);

            if (contact.getContactTelDetails() != null)
                for (ContactTelDetail contactTelDetail : contact.getContactTelDetails())
                    System.out.println(contactTelDetail);

            if (contact.getHobbies() != null)
                for (Hobby hobby : contact.getHobbies())
                    System.out.println(hobby);


            System.out.println();
        }
    }
}
