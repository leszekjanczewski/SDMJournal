package pl.leszekjanczewski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.leszekjanczewski.model.Role;

@Repository("roleRepo")
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByRole(String role);

}
