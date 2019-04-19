package info.zdziech.spring.tout;


import info.zdziech.spring.tout.api.UserRepository;
import info.zdziech.spring.tout.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        UserRepository userRepository = context.getBean("repozytoriumUżytkownikow", UserRepository.class);

        User janek = userRepository.createUser("Janek");
    }
}
