package ch4_detailed_configure_spring.page_156_factory_bean_and_factory_method_attributes;

import java.security.MessageDigest;

public class MessageDigestFactory
{
    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }

    static {
        System.out.println("Иницализировался");
    }

    public void setAlgorithmName(String algorithmName) {
        System.out.println("Переобъявляем algorithmName на  " + algorithmName);
        this.algorithmName = algorithmName;
    }
}
