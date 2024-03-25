package com.von.api.user;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = "id")

@Entity(name = "users")

public class User {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String username;
    private String password;
    private String name;
    private String pNum;
    private String job;

    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password
            , String name, String pNum, String job) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.pNum = pNum;
        this.job = job;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
