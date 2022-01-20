package javaTestPackage;


import javaTestPackage.customAnnotationCounter.Counter;
import javaTestPackage.customAnnotationCounter.CounterProxy;
import javaTestPackage.customAnnotationCounter.SomeClassWithCounter;


public class MainTest {
    public static void main(String[] args) {


        Counter t = (Counter) CounterProxy.newInstance(new SomeClassWithCounter());

        t.thisMethodUsingAnnotation();

    }

}
