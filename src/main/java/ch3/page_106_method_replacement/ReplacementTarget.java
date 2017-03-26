package ch3.page_106_method_replacement;

public class ReplacementTarget {
    public String formatMessage(String msg) {
        return "<h1>" + msg + "</h1>"; 
    }

    public String formatMessage(Object msg) {
        return "<h1>" + msg + "</h1>"; 
    }
}
