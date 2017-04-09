package ch10_check_formated_and_type.page_504_jsr349;

public enum CustomerType {
    INDIVIDUAL("I"), CORPORATE("C");

    private String code;

    private CustomerType(String code) {
        this.code = code;
    }

    public String toString() {
        return this.code;
    }
}
