package ch8_JPA.page_439_hibernate_envers;

import org.springframework.data.repository.CrudRepository;

public interface ContactAuditRepository extends CrudRepository<ContactAudit, Long>
{
}
