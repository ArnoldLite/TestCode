package javaTestPackage.customAnnotationCounter;


public class SomeClassWithCounter implements Counter {

    public void thisMethodUsingAnnotation () {
        methodWithSomeLogic();
    }

    public void methodWithSomeLogic(){
        System.out.println("Counter: Start ");
        try {
            System.out.println("some logic");
            for(int i = 0; i<3; i++){
                Thread.sleep(1000);
                System.out.println(i+1);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Counter: Stop");

    }

}
