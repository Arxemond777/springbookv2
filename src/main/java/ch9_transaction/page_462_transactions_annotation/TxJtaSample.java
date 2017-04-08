package ch9_transaction.page_462_transactions_annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TxJtaSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch9_transaction/page_462_transactions_annotation/tx-jta-app-context.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("contactService", ContactService.class);

        Contact contact = new Contact();
        contact.setFirstName("Jta");
        contact.setLastName("Manager");
        contact.setVersion(1);
        contactService.save(contact);
        System.out.println("Contact saved successfully");
    }
} 
