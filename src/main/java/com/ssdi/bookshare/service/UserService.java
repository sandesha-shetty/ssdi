package com.ssdi.bookshare.service;

import com.ssdi.bookshare.model.User;
import com.ssdi.bookshare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public List<User> findUserByName(String name) {
        return userRepository.findByName(name);
    }

    public void save(User user){
        userRepository.save(user);
    }

    public User get(Integer id){
        return userRepository.findById(id).get();
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }




}
