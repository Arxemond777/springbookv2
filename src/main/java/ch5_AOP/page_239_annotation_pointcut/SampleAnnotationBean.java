package ch5_AOP.page_239_annotation_pointcut;

public class SampleAnnotationBean {
    @AdviceRequired
    public void foo(int x) {
        System.out.println("Invoked foo() with: "  +x);
    }

    public void bar() {
        System.out.println("Invoked bar()");
    }
}
