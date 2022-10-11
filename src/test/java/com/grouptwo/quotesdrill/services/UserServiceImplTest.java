package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService = new UserServiceImpl();


    @Test
    public void testThatUserServiceWorks() {
        assertNotNull(userService);
    }

    @Test
    public void testThatUserCanAddQuote() {
        AddUserQuoteDto addUserQuoteDto = AddUserQuoteDto.builder()
                .author("Amaka")
                .quote("If you sleep well, you get dull")
                .tag("motivation")
                .build();
        AddUserQuoteDto userQuote = userService.addUserQuote(addUserQuoteDto);
        assertEquals(addUserQuoteDto.getQuote(), userQuote.getQuote());
        assertTrue(userQuote.isSuccess());
    }

    @Test
    public void testThatUserCanGetQuote() {
        GetUserQuoteRequest getUserQuotes = new GetUserQuoteRequest("amaka@adeshola.com");
        userService.getUserQuotes(getUserQuotes);

    }
}