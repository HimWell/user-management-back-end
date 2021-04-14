package tech.user.usermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.user.usermanagement.model.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}
