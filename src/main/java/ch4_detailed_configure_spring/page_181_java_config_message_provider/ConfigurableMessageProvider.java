package ch4_detailed_configure_spring.page_181_java_config_message_provider;

public class ConfigurableMessageProvider implements MessageProvider
{
    private String message = "Default message";

    public ConfigurableMessageProvider() {

    }

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
