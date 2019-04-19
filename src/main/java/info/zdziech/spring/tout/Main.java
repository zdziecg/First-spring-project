package info.zdziech.spring.tout;

import info.zdziech.spring.tout.api.Logger;
import info.zdziech.spring.tout.api.UserRepository;
import info.zdziech.spring.tout.domain.User;
import info.zdziech.spring.tout.implementations.LoggerImpl;
import info.zdziech.spring.tout.implementations.UsersRepositoryImpl;

public class Main {
    public static void main(String [] args) {
        Logger logger = new LoggerImpl();
        UserRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);

        User user = usersRepository.createUser("Janek");
    }
}
