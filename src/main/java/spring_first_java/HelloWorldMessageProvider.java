package spring_first_java;

public class HelloWorldMessageProvider implements MessageProvider
{
    public String getMessage() {
        return "Hello world";
    }
}
