package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.dtos.requests.GetListQuoteRequest;
import com.grouptwo.quotesdrill.dtos.requests.GetQuoteRequest;
import com.grouptwo.quotesdrill.dtos.responses.GetListQuoteResponse;
import com.grouptwo.quotesdrill.dtos.responses.GetQuoteResponse;

public interface ApiQuotesService {
 GetQuoteResponse getQuote(GetQuoteRequest request);


 GetListQuoteResponse getTopic(GetListQuoteRequest request);
}
