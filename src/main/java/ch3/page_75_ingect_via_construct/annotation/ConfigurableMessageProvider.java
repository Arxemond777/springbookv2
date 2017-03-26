package ch3.page_75_ingect_via_construct.annotation;

import ch3.page_75_ingect_via_construct.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    
    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
    	return this.message;
    }
}
