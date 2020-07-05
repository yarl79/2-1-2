import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        bean2.setMessage("Another helloWorld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        catBean2.setMessage("Meauu twice");
        System.out.println(catBean1.getMessage());
        System.out.println(catBean2.getMessage());

        System.out.println(bean1 == bean2);
        System.out.println(catBean1 == catBean2);
    }
}