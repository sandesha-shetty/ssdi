package com.ssdi.bookshare.repository;

import com.ssdi.bookshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
@Query("select u from User u where first_name like %?1%")
    List<User> findByName(String name);
}
