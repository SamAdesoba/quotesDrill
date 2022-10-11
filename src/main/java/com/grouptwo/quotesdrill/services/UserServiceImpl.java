package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.data.dto.AddUserDto;
import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.UserQuotesDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import com.grouptwo.quotesdrill.data.model.ApiQuotes;
import com.grouptwo.quotesdrill.data.model.User;
import com.grouptwo.quotesdrill.data.model.UserQuote;
import com.grouptwo.quotesdrill.data.repositories.UserQuotesRepository;
import com.grouptwo.quotesdrill.data.repositories.UserRepository;
import com.grouptwo.quotesdrill.exceptions.UserDoesNotExistException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserQuotesRepository userQuotesRepository;
    @Autowired
    private ModelMapper modelMapper;

    private long  since = 1L;
    private long until = 100L;


    @Override
    public AddUserDto addUser(AddUserDto addUserDto) {
        User user = modelMapper.map(addUserDto, User.class);
        return modelMapper.map(user, AddUserDto.class);
    }
    @Override
    public UserQuotesDto getUserQuotes(GetUserQuoteRequest getUserQuoteRequest) {
        Optional<User> optionalUser = userRepository.findByEmail(getUserQuoteRequest.getUserEmail());
        if (optionalUser.isEmpty()) throw new UserDoesNotExistException("Please log in!!!");

        List<UserQuote> userQuotes = userQuotesRepository.findUserQuoteByIdBetween(since, until);
        since += 100;
        until += 100;
        UserQuotesDto userQuotesDto = new UserQuotesDto(userQuotes);
        return userQuotesDto;
    }

    @Override
    public ApiQuotes getApiQuotes() {
        return null;
    }

    @Override
    public AddUserQuoteDto addUserQuote(AddUserQuoteDto addUserQuote) {
        UserQuote userQuote = modelMapper.map(addUserQuote, UserQuote.class);
        UserQuote quote = userQuotesRepository.save(userQuote);
        AddUserQuoteDto response = modelMapper.map(quote, AddUserQuoteDto.class);
        response.setSuccess(true);
        return response;
    }
}
