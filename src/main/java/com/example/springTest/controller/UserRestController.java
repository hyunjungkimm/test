package com.example.springTest.controller;


import com.example.springTest.entity.User;
import com.example.springTest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping(value = "/info1")
    public ResponseEntity<User> info1(@RequestBody User user){
        return ResponseEntity.ok(userService.retrieveUserInfo(user));
    }

    @PostMapping(value = "/info2")
    public ResponseEntity<User> info2(@RequestParam(value = "userName", required = true) String userName){
        User user = userService.retrieveUserInfo(userName);

        if(user == null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(user);
    }

    @PostMapping(value = "/info3")
    public ResponseEntity<User> info3(@RequestParam(value = "userName", required = true) String userName){

        return Optional.ofNullable(userService.retrieveUserInfo(userName))
            .map(user -> ResponseEntity.ok(user))
            .orElse(ResponseEntity.noContent().build());
    }


}
