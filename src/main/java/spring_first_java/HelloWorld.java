package spring_first_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld
{

    public static void main(String[] args) throws Exception {
//        MessageRender mr = new StandartOutMessageRender();
//        MessageProvider mp = new HelloWorldMessageProvider();
//        mr.setMessageProvider(mp);
//        mr.render();

        /** С Factory*/
//        MessageRender mr = MessageSupportFactory.getInstance().getMessageRender();
//        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
//        mr.setMessageProvider(mp);
//        mr.render();

        /** С Spring */
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext
                    //("classpath*:src/main/java/spring_first_java/app-context.xml");
                    //("classpath*:target/classes/META-INF/spring/app-context.xml");
                    ("META-INF/spring/app-context.xml");

            System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
//            System.out.println(ctx.getBeanDefinitionCount());
            MessageRender mr = ctx.getBean("renderer", MessageRender.class);
            mr.render();
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
        } catch (Exception e) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
            e.printStackTrace();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }
    }

}

