package ch9_transaction.page_475_transaction_programatic;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TxProgrammaticSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch9_transaction/page_475_transaction_programatic/tx-programmatic-app-context.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("contactService",
                ContactService.class);

        System.out.println("Contact count: " + contactService.countAll());
    }
}
