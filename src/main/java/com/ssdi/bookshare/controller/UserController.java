package com.ssdi.bookshare.controller;

import com.ssdi.bookshare.model.User;
import com.ssdi.bookshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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


}



//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public ResponseEntity < User > getUserById(
//            @PathVariable(value = "id") Long userId) throws Exception {
//        User user = userRepository.findById(userId)
//                .orElseThrow(()-> new Exception("User not found :: " + userId));
//        return ResponseEntity.ok().body(user);
//    }
//
//    @PostMapping("/users")
//    public User createUser(@Valid @RequestBody User user) {
//        return userRepository.save(user);
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity < User > updateUser(
//            @PathVariable(value = "id") Long userId,
//            @Valid @RequestBody User userDetails) throws Exception {
//        User user = userRepository.findById(userId)
//                .orElseThrow(()-> new Exception("User not found :: " + userId));
//        user.setFirstName(userDetails.getFirstName());
//        user.setLastName(userDetails.getLastName());
//        user.setEmail(userDetails.getEmail());
//        user.setPhoneNumber(userDetails.getPhoneNumber());
//        final User updatedUser = userRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public Map< String, Boolean > deleteUser(
//            @PathVariable(value = "id") Long userId) throws Exception {
//        User instructor = userRepository.findById(userId)
//                .orElseThrow(()-> new Exception("User not found :: " + userId));
//        userRepository.delete(instructor);
//        Map < String, Boolean > response = new HashMap< >();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }





