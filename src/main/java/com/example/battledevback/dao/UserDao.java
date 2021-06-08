package com.example.battledevback.dao;

import com.example.battledevback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
    /* CREATE AND/OR UPDATE USER */
    User save(User user);
    /* READ USER */
    List<User> findAll();
    User findById(int id);

    /* DELETE USER */
    void deleteById(int id);
}
