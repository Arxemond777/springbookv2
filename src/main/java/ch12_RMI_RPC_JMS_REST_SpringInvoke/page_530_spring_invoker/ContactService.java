package ch12_RMI_RPC_JMS_REST_SpringInvoke.page_530_spring_invoker;

import java.util.List;

public interface ContactService
{
    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);
}
