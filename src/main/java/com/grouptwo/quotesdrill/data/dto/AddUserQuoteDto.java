package com.grouptwo.quotesdrill.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddUserQuoteDto {
    private String tag;
    private String quote;
    private String author;
    private boolean success;
}
