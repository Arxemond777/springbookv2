package CH6_JDBC.page_300_spring_jdbc_embedded;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JdbcContactDaoSample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/CH6_JDBC/page_300_spring_jdbc_embedded/app-context-xml.xml");
        ctx.refresh();

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);

        //Берется из H2, смотри classpath:META_INF/sql/CH6_JDBC/page_300_spring_jdbc_embedded/
        System.out.println("First name for contact id 1 is: " + contactDao.findFirstNameById(1l));
        System.out.println("First name for contact id 1 is: " + contactDao.findFirstNameById(3l));
    }
}
