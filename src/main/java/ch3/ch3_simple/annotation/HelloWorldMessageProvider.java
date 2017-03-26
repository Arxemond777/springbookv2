package ch3.ch3_simple.annotation;

import ch3.ch3_simple.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
