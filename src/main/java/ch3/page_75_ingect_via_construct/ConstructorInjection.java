package ch3.page_75_ingect_via_construct;

public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency; 
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
