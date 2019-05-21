package pl.leszekjanczewski.service;

import org.springframework.stereotype.Service;
import pl.leszekjanczewski.model.Role;
import pl.leszekjanczewski.model.User;
import pl.leszekjanczewski.repository.RoleRepo;
import pl.leszekjanczewski.repository.UserRepo;

import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserService {

    private UserRepo userRepo;
    private RoleRepo roleRepo;

    public User findUserByLogin(String login) {
        return userRepo.findByLogin(login);
    }

    public void saveUser(User user) {
        Role userRole = roleRepo.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepo.save(user);
    }
}
