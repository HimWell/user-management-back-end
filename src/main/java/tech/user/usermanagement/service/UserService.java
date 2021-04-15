package tech.user.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.user.usermanagement.exception.UserNotFoundException;
import tech.user.usermanagement.model.User;
import tech.user.usermanagement.repo.UserRepo;

import javax.transaction.Transactional;
import java.util.*;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User findUserById(Long id) {
        return userRepo.findUserById(id).
                orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public User addUser(User user) {
        user.setUserCode(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    // go to user repo.java for delete
    public void deleteUser(Long id) {
        userRepo.deleteUserById(id);
    }
}
