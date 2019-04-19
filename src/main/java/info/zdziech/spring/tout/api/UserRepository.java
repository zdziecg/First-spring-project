package info.zdziech.spring.tout.api;

import info.zdziech.spring.tout.domain.User;

public interface UserRepository {
    User createUser (String name);
    void setLogger(Logger logger);
}
