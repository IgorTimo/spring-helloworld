package my_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println("object references are the same for HelloWorld: " + (helloWorld1 == helloWorld2));
        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println("object references are the same for Cat: " + (cat1 == cat2));

    }
}
