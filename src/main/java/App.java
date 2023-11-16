import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("getCat");
        Cat beanCat2 = (Cat) applicationContext.getBean("getCat");
        beanCat1.catSay();
        beanCat2.catSay();

        System.out.println("Бины HelloWorld указывают на один и тот же объект? : " + (bean == bean2));
        System.out.println("Бины Cat указывают на один и тот же объект? : " + (beanCat1 == beanCat2));

    }
}