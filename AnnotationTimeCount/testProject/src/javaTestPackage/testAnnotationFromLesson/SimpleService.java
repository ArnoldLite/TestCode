package javaTestPackage.testAnnotationFromLesson;

@Service(name = "Super simple service")
public class SimpleService {

    @Init
    public void initService(){
        System.out.println("Начало метода");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("--- Инициализация простого сервиса ---");
    }

    public void someMethod(){
        System.out.println("some method");
    }
}
