package ch8_JPA.page_398_jpa_crud;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);

    List<Contact> findAllByNativeQuery();
}
