package com.grouptwo.quotesdrill.data.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserQuoteRequest {
        private String userEmail;
}
