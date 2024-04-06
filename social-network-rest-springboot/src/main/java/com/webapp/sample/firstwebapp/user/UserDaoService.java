package com.webapp.sample.firstwebapp.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserDaoService {

    public static List<User> users =new ArrayList<>();
    public static int userCount = 0;

    static{
        users.add(new User(++userCount,"Mani", LocalDate.now()));
        users.add(new User(++userCount,"Mani", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount,"Mani", LocalDate.now().minusMonths(25)));
    }

    public List<User> findAll(){
        return users;
    }
    public User findOne(int id) {
        //Need to understand functional programming for the below lines
        Predicate<? super User> predicate = user -> user.getId()==id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }


    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
