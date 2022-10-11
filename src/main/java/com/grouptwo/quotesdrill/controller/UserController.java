package com.grouptwo.quotesdrill.controller;


import com.grouptwo.quotesdrill.data.dto.AddUserDto;
import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.UserQuotesDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import com.grouptwo.quotesdrill.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add/")
    public AddUserDto addUser(@RequestBody AddUserDto addUserDto){
        return userService.addUser(addUserDto);
    }

    @GetMapping("get/")
    public UserQuotesDto getUserQuotes(@RequestBody GetUserQuoteRequest getUserQuoteRequest){
        return userService.getUserQuotes(getUserQuoteRequest);
    }

    @PostMapping("/post")
    public AddUserQuoteDto addUserQuote( @RequestBody AddUserQuoteDto addUserQuote){
        return userService.addUserQuote(addUserQuote);
    }
}
