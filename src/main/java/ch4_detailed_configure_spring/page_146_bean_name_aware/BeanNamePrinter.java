package ch4_detailed_configure_spring.page_146_bean_name_aware;

import org.springframework.beans.factory.BeanNameAware;

import java.util.Date;

public class BeanNamePrinter implements BeanNameAware {
    private String beanName;

    public void setBeanName(String beanName) {
        this.beanName = beanName + " " + new Date().toString();
    }

    public void someOperation() {
        System.out.println("Bean [" + beanName + "] - someOperation()");
    }
}
