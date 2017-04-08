package ch9_transaction.page_480_transactions_jta;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);

    long countAll();
}
