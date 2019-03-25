package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.leszekjanczewski.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {


}
