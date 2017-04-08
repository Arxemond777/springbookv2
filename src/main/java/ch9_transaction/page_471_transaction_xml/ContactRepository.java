package ch9_transaction.page_471_transaction_xml;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long>
{
    @Query("select count(c) from Contact c")
    Long countAllContacts();
}
