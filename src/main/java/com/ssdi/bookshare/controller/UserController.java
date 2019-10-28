package com.ssdi.bookshare.controller;

import com.ssdi.bookshare.model.User;
import com.ssdi.bookshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll(@RequestParam Optional<String> name) {
        List<User> listUsers = userService.findUserByName(name.orElse(" "));
        return listUsers;
    }

    @GetMapping("/allusers")
    public List<User> findAllUsers(){
        List<User> listUsers = userService.listAll();
        return listUsers;
    }

    @DeleteMapping("/users/{id}")
    public Map< String, Boolean > deleteUser(
            @PathVariable(value = "id") Integer userId) throws Exception {
        userService.delete(userId);
        Map < String, Boolean > response = new HashMap< >();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

        @GetMapping("/users/{id}")
    public ResponseEntity< User > getUserById(
            @PathVariable(value = "id") Integer userId) throws Exception {
        User user = userService.get(userId);
        return ResponseEntity.ok().body(user);
    }

        @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user) {
         userService.save(user);
    }




}





