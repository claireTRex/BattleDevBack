package com.example.battledevback.controllers;

import com.example.battledevback.dao.UserDao;
import com.example.battledevback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/users")
public class UserController {
    /* AUTOWIRE DAOS */
    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    /* CRUD */
    /* GET */
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userDao.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /* POST */
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userDao.save(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    /* PUT || PATCH */
    @PutMapping("/{id}")
    public ResponseEntity<User> putUser(@PathVariable int id, @RequestBody User user) {
        User userToModify = userDao.findById(id);

        if (userToModify == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        user.setId(id);
        userToModify = userDao.save(user);
        return new ResponseEntity<>(userToModify, HttpStatus.OK);
    }

    /* DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        User userToDelete = userDao.findById(id);

        if (userToDelete == null) {
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        userDao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
