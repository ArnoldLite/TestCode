package javaTestPackage.customAnnotationCounter;


@FunctionalInterface
public interface Counter {
    @CounterForMethod
    void thisMethodUsingAnnotation();
}
