package com.webapp.sample.firstwebapp.user;


import com.webapp.sample.firstwebapp.user.exception.UserNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@AllArgsConstructor
@RestController
public class UserResourceController {
    private UserDaoService userDao;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userDao.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User one = userDao.findOne(id);
        if(one==null){
            throw new UserNotFoundException("Id:"+id);

        }
        return one;
    }


    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user){
    ;
        User savedUser = userDao.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}").
                        buildAndExpand(savedUser.getId()).toUri();

        return  ResponseEntity.created(location).build();
    }


}
