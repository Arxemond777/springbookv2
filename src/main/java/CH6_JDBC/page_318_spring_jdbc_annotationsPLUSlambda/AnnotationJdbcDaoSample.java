package CH6_JDBC.page_318_spring_jdbc_annotationsPLUSlambda;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class AnnotationJdbcDaoSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/CH6_JDBC/page_318_spring_jdbc_annotationsPLUSlambda/app-context-annotation.xml");
        ctx.refresh();

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);

        /** findAll */
//        List<Contact> contacts = contactDao.findAll();
//        listContacts(contacts);

        /** findByName */
//        System.out.println(contactDao.findByFirstName("Chris"));

        /** Update В H2 не обновляется, если что*/
        /*listContacts(contactDao.findAll());
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setFirstName("Chris");
        contact.setLastName("John");
        contact.setBirthDate(new Date(
                (new GregorianCalendar(1977, 10, 1)).getTime().getTime()
        ));

        contactDao.update(contact);
        listContacts(contactDao.findAll());*/

        /** Insert + KeyHolder*/
        /*listContacts(contactDao.findAll());

        Contact contact = new Contact();
        contact.setFirstName("First Name");
        contact.setLastName("Second Name");
        contact.setBirthDate(new Date(
                (new GregorianCalendar(1977, 10, 1)).getTime().getTime()
        ));

        contactDao.insert(contact);
        listContacts(contactDao.findAll());*/

        /**
         * Stored procedure поменяй на dataSource - mysql
         * Создать предварительно хранилку с 337 страницы stored-function.sql
         * DELIMITER //
         * CREATE FUNCTION getFirstNameById(in_id INT)
         * RETURNS VARCHAR(60)
         * BEGIN
         * RETURN (SELECT first_name FROM contact WHERE id = in_id);
         * END //
         * DELIMITER ;
         * */
        System.out.println(contactDao.findFirstNameById(1L));
    }

    private static void listContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
            if (contact.getContactTelDetails() != null)
                for (ContactTelDetail contactTelDetail : contact.getContactTelDetails())
                    System.out.println("----" + contactTelDetail);
            System.out.println();
        }
    }
}
