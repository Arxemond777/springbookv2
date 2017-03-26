package ch3.ch3_simple.xml;

import ch3.ch3_simple.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
