package com.von.api.user;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

@Entity(name = "users")

public class User {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String userName;
    private String password;
    private String name;
    private String pNum;
    private String job;

    @Builder(builderMethodName = "builder")
    public User(Long id, String userName, String password
            , String name, String pNum, String job) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.pNum = pNum;
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", pNum='" + pNum + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
