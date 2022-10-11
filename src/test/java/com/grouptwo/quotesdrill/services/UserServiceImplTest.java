package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.UserQuotesDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import com.grouptwo.quotesdrill.data.model.User;
import com.grouptwo.quotesdrill.data.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService = new UserServiceImpl();
    @Autowired
    private UserRepository userRepository;

    private User user;

    @BeforeEach
    void setUp(){
        User user = User.builder()
                .email("amaka@example.com")
                .firstName("amaka")
                .lastName("Ibidun")
                .build();
        this.user = user;
        userRepository.save(user);

    }

    @Test
    public void testThatUserServiceWorks() {
        assertNotNull(userService);
    }

    @Test
    public void testThatUserIsCreatedTest() {
        assertNotNull(user);
        assertEquals("amaka@example.com", user.getEmail());
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
        GetUserQuoteRequest getUserQuotes = new GetUserQuoteRequest("amaka@example.com");
        UserQuotesDto userQuotesDto = userService.getUserQuotes(getUserQuotes);
        assertThat(userQuotesDto.getUserQuotes().getClass()).isEqualTo(ArrayList.class);
    }
}