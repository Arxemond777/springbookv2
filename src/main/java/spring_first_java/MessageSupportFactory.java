package spring_first_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory
{
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRender render;
    private MessageProvider provider;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream("target/classes/spring_first_java/msf.properties"));

            String renderClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {

        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRender getMessageRender() {
        return render;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
