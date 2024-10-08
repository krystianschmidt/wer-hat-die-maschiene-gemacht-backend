package com.example.hausmeister.domain.user;

public interface UserRepository {

    User findByUsername(String username);
    boolean existsByUsername(String username);

    void save(User user);

}
