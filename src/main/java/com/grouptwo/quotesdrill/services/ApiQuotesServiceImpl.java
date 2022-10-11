package com.grouptwo.quotesdrill.services;

import com.grouptwo.quotesdrill.dtos.requests.GetListQuoteRequest;
import com.grouptwo.quotesdrill.dtos.requests.GetQuoteRequest;
import com.grouptwo.quotesdrill.dtos.responses.GetListQuoteResponse;
import com.grouptwo.quotesdrill.dtos.responses.GetQuoteResponse;
import org.springframework.stereotype.Service;


@Service
public class ApiQuotesServiceImpl implements ApiQuotesService{
	@Override
	public GetQuoteResponse getQuote(GetQuoteRequest request) {
		return null;
	}

	@Override
	public GetListQuoteResponse getListQuote(GetListQuoteRequest request) {
		return null;
	}
}
