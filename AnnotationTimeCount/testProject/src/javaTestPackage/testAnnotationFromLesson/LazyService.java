package javaTestPackage.testAnnotationFromLesson;

@Service(name = "Super lazy service")
public class LazyService {

    @Init
    public void lazyInit() throws Exception{
        System.out.println("*** Инициализация LAZY сервиса ***");
    }
}
