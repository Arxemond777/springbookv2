package ch8_JPA.page_431_spring_data_jpa_audit;

import java.util.List;

public interface ContactAuditService {
    List<ContactAudit> findAll();
    ContactAudit findById(Long id);
    ContactAudit save(ContactAudit contact);
}
