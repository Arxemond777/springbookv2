package ch3.page_73_inject_via_method_install.xml;

import ch3.page_73_inject_via_method_install.MessageProvider;
import ch3.page_73_inject_via_method_install.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer
{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
