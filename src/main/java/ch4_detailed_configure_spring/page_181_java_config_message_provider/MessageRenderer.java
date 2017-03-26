package ch4_detailed_configure_spring.page_181_java_config_message_provider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
