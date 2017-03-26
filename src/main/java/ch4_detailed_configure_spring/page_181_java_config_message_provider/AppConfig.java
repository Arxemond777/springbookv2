package ch4_detailed_configure_spring.page_181_java_config_message_provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ImportResource(value="classpath:META-INF/spring/ch4_detailed_configure_spring/page_181_java_config_message_provider/app-context-xml.xml")
@PropertySource(value="classpath:message.properties")
@ComponentScan(basePackages={"ch4_detailed_configure_spring.page_181_java_config_message_provider"})
@EnableTransactionManagement
public class AppConfig {
    @Autowired
    Environment env;

    @Bean
    @Lazy(value=true)
    public MessageProvider messageProvider() {
        return new ConfigurableMessageProvider(env.getProperty("message"));
    }

    @Bean(name="messageRenderer")
    @Scope(value="prototype")
    @DependsOn(value="messageProvider")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());

        return renderer;
    }
}
