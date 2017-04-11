package ch12_RMI_RPC_JMS_REST_SpringInvoke.page_530_spring_invoker;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long>
{
    List<Contact> findByFirstName(String firstName);
}
