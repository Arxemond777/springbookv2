package ch8_JPA.page_431_spring_data_jpa_audit;

import org.springframework.data.repository.CrudRepository;

public interface ContactAuditRepository extends CrudRepository<ContactAudit, Long> {
}
