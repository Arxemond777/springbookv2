package ch4_detailed_configure_spring.page_149_application_content_aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

public class ShutdownHookBean implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx)
        throws BeansException {

        if (ctx instanceof GenericApplicationContext) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&");
            System.out.println(ctx.getClass().getSimpleName());
            System.out.println("&&&&&&&&&&&&&&&&&&&&&");
            ((GenericApplicationContext) ctx).registerShutdownHook();
        }
    }
}
