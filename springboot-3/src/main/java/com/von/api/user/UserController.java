package com.von.api.user;

import com.von.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repo;

//    @GetMapping("/name")
//    public String hello(){
//        return "welcom";
//    }

    @PostMapping("/api/login")
    public Map<String,?> name(@RequestBody Map<String,?> map){
        String name = (String)map.get("username");
        System.out.println("request가 가져온 이름 : "+name);
        Map<String,String> respMap = new HashMap<>();
        respMap.put("username","환영환영."+name);
        return respMap;
    }

    @PostMapping(path = "/api/users")
    public Map<String ,?> join(@RequestBody Map<?,?> map){
        User newUser = repo.save(User.builder()
                .userName((String) map.get("userId"))
                .password((String) map.get("password"))
                .name((String) map.get("name"))
                .pNum((String) map.get("pNum"))
                .job((String) map.get("job"))
                .build());

        System.out.println("DB에 저장된 user 정보 : "+ newUser);
        Map<String, Messenger> respMap = new HashMap<>();
        respMap.put("result",Messenger.SUCCESS);
        return respMap;
    }

    public Map<String,?> save(@RequestBody Map<String,?> map) {
                return null;
    }

    public Map<String,?> login(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> changePassword(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> delete(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUsersByName(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUsersByJob(@RequestBody Map<String,?> map) {
        return null;
    }


    public Map<String,?> count() {
        return null;
    }

    public Map<String,?> findUsers() throws SQLException {
        return null;
    }

    public void createTable() throws SQLException {
    }

    public void deleteTable() throws SQLException {
    }


    public Map<String,?> getOne(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUser(@RequestBody Map<String,?> map) {
        return null;
    }
}
