package pl.leszekjanczewski.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//TODO - persistance
@Entity(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    Long userId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column
    String login;

    @Column
    String password;

    @Column
    Boolean shift;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
}
