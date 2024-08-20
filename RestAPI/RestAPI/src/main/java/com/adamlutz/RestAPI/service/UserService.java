package com.adamlutz.RestAPI.service;

import com.adamlutz.RestAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Adam", 32, "adam@mail.com");
        User user2 = new User(2, "Mada", 33, "mada@mail.com");
        User user3 = new User(3, "Dama", 34, "dama@mail.com");
        User user4 = new User(4, "Adma", 35, "adma@mail.com");
        User user5 = new User(5, "Mdam", 36, "mdam@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
