package ch5_AOP.page_269_proxyfactorybean_introduction;

import org.springframework.context.support.GenericXmlApplicationContext;

public class IntroductionConfigExample
{
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch5_AOP/page_269_proxyfactorybean_introduction/app-context-xml.xml");
        ctx.refresh();

        TargetBean bean = (TargetBean) ctx.getBean("bean");
        IsModified mod = (IsModified) bean;

        System.out.println("Is TargetBean?: " + (bean instanceof TargetBean));
        System.out.println("Is IsModified?: " + (bean instanceof IsModified));

        System.out.println("Has been modified?: " + mod.isModified());
        bean.setName("Chris Schaefer");

        System.out.println("Has been modified?: " + mod.isModified());
        bean.setName("Clarence Ho");

        System.out.println("Has been modified?: " + mod.isModified());
    }
}
