package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.dtos.requests.GetListQuoteRequest;
import com.grouptwo.quotesdrill.dtos.requests.GetQuoteRequest;
import com.grouptwo.quotesdrill.dtos.responses.GetListQuoteResponse;
import com.grouptwo.quotesdrill.dtos.responses.GetQuoteResponse;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;


@Service
public class ApiQuotesServiceImpl implements ApiQuotesService{
	@Override
	public GetQuoteResponse getQuote(GetQuoteRequest request) {

		return null;
	}

	@Override
	public GetListQuoteResponse getTopic(GetListQuoteRequest request) {
//		HttpResponse<String> response = Unirest.get("https://healthruwords.p.rapidapi.com/v1/topics/")
//				  .header("X-RapidAPI-Key", "8f8cc57d28mshb1a2a64ae37e25cp183669jsndce9b1fef65d")
//				  .header("X-RapidAPI-Host", "healthruwords.p.rapidapi.com")
//				  .asString();
//		return (GetListQuoteResponse) response;
		return null;
	}
}
