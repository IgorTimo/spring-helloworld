import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hello1 = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld hello2 = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println("object references are the same for HelloWorld: " + (hello1 == hello2));
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("object references are the same for Cat: " + (cat1 == cat2));

    }
}