package info.zdziech.spring.tout.implementations;

import info.zdziech.spring.tout.api.Logger;
import info.zdziech.spring.tout.api.UserRepository;
import info.zdziech.spring.tout.domain.User;

public class UsersRepositoryImpl implements UserRepository {
    private Logger logger;
    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;

    }
}
