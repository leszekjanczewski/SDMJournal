package pl.leszekjanczewski.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "*Proszę wprowadzić imię")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "*Proszę wprowadzić nazwisko")
    private String lastName;

    @Column
    @NotEmpty(message = "*Proszę wprowadzić login")
    private String login;

    @Column
    @Length(min = 5, message = "*Hasło musi mieć conajmniej 5 znaków")
    @NotEmpty(message = "*Proszę wprowadzić hasło")
    private String password;

    @Column
    private Boolean shift;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(@NotEmpty(message = "*Proszę wprowadzić imię") String firstName, @NotEmpty(message = "*Proszę wprowadzić nazwisko") String lastName, @NotEmpty(message = "*Proszę wprowadzić login") String login, @NotEmpty(message = "*Proszę wprowadzić hasło") String password, Boolean shift) {
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
