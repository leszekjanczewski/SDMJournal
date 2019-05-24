package pl.leszekjanczewski.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    @NotNull(message = "*Proszę wprowadzić imię")
    private String firstName;

    @Column(name = "last_name")
    @NotNull(message = "*Proszę wprowadzić nazwisko")
    private String lastName;

    @Column(name = "login")
    @NotNull(message = "*Proszę wprowadzić login")
    private String login;

    @Column(name = "password")
    @Size(min = 5, message = "*Hasło musi mieć conajmniej 5 znaków")
    @NotNull(message = "*Proszę wprowadzić hasło")
    private String password;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "shift")
    private Boolean shift;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(@NotNull(message = "*Proszę wprowadzić imię") String firstName, @NotNull(message = "*Proszę wprowadzić nazwisko") String lastName, @NotNull(message = "*Proszę wprowadzić login") String login, @NotNull(message = "*Proszę wprowadzić hasło") String password, Boolean shift) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.shift = shift;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getShift() {
        return shift;
    }

    public void setShift(Boolean shift) {
        this.shift = shift;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
