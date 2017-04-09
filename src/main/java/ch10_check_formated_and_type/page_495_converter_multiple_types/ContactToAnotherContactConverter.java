package ch10_check_formated_and_type.page_495_converter_multiple_types;

import org.springframework.core.convert.converter.Converter;

public class ContactToAnotherContactConverter
        implements Converter<Contact, AnotherContact>
{

    @Override
    public AnotherContact convert(Contact contact) {
        AnotherContact anotherContact = new AnotherContact();
        anotherContact.setFirstName(contact.getLastName());
        anotherContact.setLastName(contact.getFirstName());
        anotherContact.setBirthDate(contact.getBirthDate());
        anotherContact.setPersonalSite(contact.getPersonalSite());

        return anotherContact;
    }
}
