package ch8_JPA.page_426_spring_data_jpa;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
