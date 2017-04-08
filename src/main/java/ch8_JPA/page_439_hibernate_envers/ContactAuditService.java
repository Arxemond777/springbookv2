package ch8_JPA.page_439_hibernate_envers;

import java.util.List;

public interface ContactAuditService
{
    List<ContactAudit> findAll();

    ContactAudit findById(Long id);

    ContactAudit save(ContactAudit contact);

    ContactAudit findAuditByRevision(Long id, int revision);
}
