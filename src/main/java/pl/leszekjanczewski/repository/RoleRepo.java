package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.leszekjanczewski.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
