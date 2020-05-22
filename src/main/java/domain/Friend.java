package domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "friend")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    private String firstName;

    private BigInteger age;

    private String gender;

    public Friend(BigInteger id, String firstName, BigInteger age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }


    public BigInteger getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public BigInteger getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

