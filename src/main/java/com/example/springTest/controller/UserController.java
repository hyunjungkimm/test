package com.example.springTest.controller;

import com.example.springTest.entity.User;
import com.example.springTest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/info")
    public @ResponseBody User info(@RequestBody User user){
        return userService.retrieveUserInfo(user);
    }

    @GetMapping(value = "/infoView")
    public String infoView(Model model, @RequestParam(value="userName", required = true) String userName){
        User user = userService.retrieveUserInfo(userName);
        model.addAttribute("user", user);
        return "/user/userInfoView";
    }

}
