import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWoldbean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWoldbean1.getMessage());
        HelloWorld helloWoldbean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сравнение для пары бинов типа HelloWold " + (helloWoldbean1 == helloWoldbean2));
        System.out.println("Сравнение для пары бинов типа Cat " + (cat1 == cat2));
    }
}