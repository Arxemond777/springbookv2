package spring_first_java;

public interface MessageRender
{
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
