package ch3.page_75_ingect_via_construct.xml;

import ch3.page_75_ingect_via_construct.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider
{
    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
