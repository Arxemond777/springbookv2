package ch10_check_formated_and_type.page_511_jsr349_aspectj;

public enum Gender
{
    MALE("M"), FEMALE("F");

    private String code;

    private Gender(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
