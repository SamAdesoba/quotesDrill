package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.data.dto.AddUserDto;
import com.grouptwo.quotesdrill.data.dto.AddUserQuoteDto;
import com.grouptwo.quotesdrill.data.dto.UserQuotesDto;
import com.grouptwo.quotesdrill.data.dto.request.GetUserQuoteRequest;
import com.grouptwo.quotesdrill.data.model.ApiQuotes;

public interface UserService {

    AddUserDto addUser(AddUserDto addUserDto);

    UserQuotesDto getUserQuotes(GetUserQuoteRequest getUserQuoteRequest);
    ApiQuotes getApiQuotes();

    AddUserQuoteDto addUserQuote(AddUserQuoteDto addQuoteRequest);
}
