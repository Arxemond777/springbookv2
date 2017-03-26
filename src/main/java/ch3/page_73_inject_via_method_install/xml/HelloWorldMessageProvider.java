package ch3.page_73_inject_via_method_install.xml;

import ch3.page_73_inject_via_method_install.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
