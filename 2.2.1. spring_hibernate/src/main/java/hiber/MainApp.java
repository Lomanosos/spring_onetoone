package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
      UserService userService = context.getBean(UserService.class);

      userService.addUser(new User("petr", "petr", "petrovich@internet.ru", new Car("bmw", 9)));
      userService.addUser(new User("rebro", "adam", "jesus@internet.eu", new Car("tree", 0)));
      userService.addUser(new User("roberto", "mafiozi", "money@internet.eu", new Car("ferari", 777)));


      //список пользов.
      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car model = " + user.getCar().getModel());
         System.out.println("Car series = " + user.getCar().getSeries());
         System.out.println();
      }
      //работа метода
      System.out.println(userService.getUserByCar("bmw", 9));

      context.close();
   }
}
