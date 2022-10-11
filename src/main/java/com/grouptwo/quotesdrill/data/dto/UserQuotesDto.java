package com.grouptwo.quotesdrill.data.dto;

import com.grouptwo.quotesdrill.data.model.UserQuote;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserQuotesDto {

    private List<UserQuote> userQuotes;
}
