package com.example.FilterUser;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository  {
    private List<User> users=new ArrayList<>();
    public UserRepository(){
        users.add(new User("Alice", 25, "NewYork"));
        users.add(new User("Bob", 30, "LosAngeles"));
        users.add(new User("Charlie", 25, "NewYork"));
    }

    public List<User> findAll(){
        return users;
    }
    public List<User> findByAgeCity(Integer age, String city){
        return users.stream()
                .filter(user -> (user.getAge()==age)&&(user.getCity().equalsIgnoreCase(city)))
                .collect(Collectors.toList());
    }
}
