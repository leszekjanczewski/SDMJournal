package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.leszekjanczewski.model.User;

@Repository("userRepo")
public interface UserRepo extends JpaRepository<User, Long> {

    User findByLogin(String login);

}
