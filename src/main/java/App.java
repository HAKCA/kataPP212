import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstCat =
                (Cat) applicationContext.getBean("red");
        Cat secondCat =
                (Cat) applicationContext.getBean("red");
        boolean helloWords = bean == bean2;
        boolean cats = firstCat == secondCat;
        System.out.println(helloWords);
        System.out.println(cats);
    }
}