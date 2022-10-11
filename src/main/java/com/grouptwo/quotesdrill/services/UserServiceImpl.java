package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import com.grouptwo.quotesdrill.data.model.ApiQuotes;
import com.grouptwo.quotesdrill.data.model.UserQuote;
import com.grouptwo.quotesdrill.data.repositories.ApiQuotesRepository;
import com.grouptwo.quotesdrill.data.repositories.UserQuotesRepository;
import com.grouptwo.quotesdrill.data.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ApiQuotesRepository apiQuotesRepository;

    @Autowired
    private UserQuotesRepository userQuotesRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddUserQuoteDto getUserQuotes(GetUserQuoteRequest getUserQuoteRequest) {
        return null;
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
