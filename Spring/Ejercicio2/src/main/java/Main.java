import Entidades.NotificationService;
import Entidades.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notificacion = (NotificationService) context.getBean("notificationService");
        UserService user = (UserService) context.getBean("userService");
        user.notificationService.imprimirSaludo();
    }
}
