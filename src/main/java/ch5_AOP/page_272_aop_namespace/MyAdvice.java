package ch5_AOP.page_272_aop_namespace;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice
{
    public void simpleBeforeAdvice(JoinPoint joinPoint, int intValue) {
        if (intValue != 100)
            System.out.println("Executing: " +
                    joinPoint.getSignature().getDeclaringTypeName() + " "
                    + joinPoint.getSignature().getName()
                    + " argument: " + intValue
            );
    }

    /**
     * For Around (page 275)
     */
    public Object simpleAroundAdvice(ProceedingJoinPoint pjp, int intValue) throws Throwable {
        if (intValue != 100)
            System.out.println(
                    "Before execution: " + pjp.getSignature().getDeclaringTypeName()
                            + " " + pjp.getSignature().getName()
                            + " argument: " + intValue
            );

        Object retVal = pjp.proceed();

        System.out.println(
                "After execution: " + pjp.getSignature().getDeclaringTypeName()
                        + " " + pjp.getSignature().getName()
                        + " argument: " + intValue
        );

        return retVal;
    }
}
