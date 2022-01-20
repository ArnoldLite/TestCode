package javaTestPackage.testAnnotationFromLesson;

import java.lang.annotation.*;

@Inherited()
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Service {

    String name();

    boolean lazyLoad() default false;
}
