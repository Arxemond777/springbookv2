package ch3.page_73_inject_via_method_install.annotation;

import ch3.page_73_inject_via_method_install.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
