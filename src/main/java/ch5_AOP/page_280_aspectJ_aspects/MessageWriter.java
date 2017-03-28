package ch5_AOP.page_280_aspectJ_aspects;

public class MessageWriter
{
    public void writeMessage() {
        System.out.println("foobar!");
    }

    public void foo() {
        System.out.println("foo");
    }
}