package com.unix.unixsystem.controller;

import com.unix.unixsystem.entity.User;
import com.unix.unixsystem.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="users")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> createUser(@RequestBody User user) {

        return new ResponseEntity<>(
                userService.addUser(user),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/")
    public ResponseEntity<?> get() {

        return new ResponseEntity<>(
                userService.getAll(),
                HttpStatus.OK
        );
    }
}