package ch7_Hibernate;

import java.util.List;

public interface ContactDao
{
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);
}
