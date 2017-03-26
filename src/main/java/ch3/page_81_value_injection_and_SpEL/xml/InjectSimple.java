package ch3.page_81_value_injection_and_SpEL.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/ch3/page_81/app-context-xml.xml");
        ctx.refresh();

        System.out.println("Поправить в конфиках имя injectSimple, можно рабочий глянуть в антоциях");
        System.exit(0);
        InjectSimple simple = (InjectSimple)ctx.getBean("injectSimple");
        System.out.println(simple); 
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds; 
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer; 
    }

    public void setAge(int age) {
        this.age = age; 
    }

    public void setHeight(float height) {
        this.height = height; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String toString() {
        return "Name: " + name + "\n" 
            + "Age: " + age + "\n"
            + "Age in Seconds: " + ageInSeconds + "\n" 
            + "Height: " + height + "\n" 
            + "Is Programmer?: " + programmer;
    }
}
