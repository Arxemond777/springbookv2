package ch4_detailed_configure_spring.page_185_profiles;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileXmlConfigExample
{
    /**
     * Можно так же запускать с использованием JVM аргумментов -Dspring.profiles.active="kindergarten"
     *
     * @param args
     */
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("kindergarten");
        ctx.load("classpath:META-INF/spring/ch4_detailed_configure_spring/page_185_profiles/*-config.xml");
        ctx.refresh();

        FoodProviderService foodProviderService =
                ctx.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();

        for (Food food : lunchSet) {
            System.out.println("Food: " + food.getName());
        }
    }
}
