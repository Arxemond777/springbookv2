package ch4_detailed_configure_spring.page_163_custom_property_editor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] name = text.split("\\s");

        setValue(new Name(name[0], name[1]));
    }
}
