package ch9_transaction.page_471_transaction_xml;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);

    long countAll();
}
