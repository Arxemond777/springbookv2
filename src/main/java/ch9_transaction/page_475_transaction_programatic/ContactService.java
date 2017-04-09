package ch9_transaction.page_475_transaction_programatic;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);

    long countAll();
}
