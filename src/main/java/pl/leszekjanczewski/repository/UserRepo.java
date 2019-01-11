package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.leszekjanczewski.model.User;

public interface UserRepo extends JpaRepository<User, Long> {


}
