package javaTestPackage.testAnnotationFromLesson;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDateTime;

public class AnnotationProcessor {

    public static void main(String[] args) {
//        inspectService(SimpleService.class);
//        inspectService(LazyService.class);
//        inspectService(String.class);
//
//        inspectMethod(SimpleService.class);

        SimpleService s = new SimpleService();

        s.initService();



    }

    static void inspectMethod(Class<?> init){

//        Object targetObj;

        Method[] methods = init.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            if(methods[i].isAnnotationPresent(Init.class)){

                Method method = methods[i];
                LocalDateTime start = LocalDateTime.now();

                System.out.println(method.getName() + " выполнен за "
                        + Duration.between(start, LocalDateTime.now()).getSeconds() + " секунд");

            }
        }


//        method.isAnnotationPresent(Init.class);
    }

    static void inspectService(Class<?> service) {

        if(service.isAnnotationPresent(Service.class)){
            Service pr = service.getAnnotation(Service.class);
            System.out.println(pr.name());
        }else{
            System.out.println("Annotation not found");
        }

    }
}
