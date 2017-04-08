package ch8_JPA.page_439_hibernate_envers;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareBean implements AuditorAware<String>
{
    public String getCurrentAuditor() {
        return "prospring4";
    }
}
