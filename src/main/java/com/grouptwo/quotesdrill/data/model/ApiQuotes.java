package com.grouptwo.quotesdrill.data.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApiQuotes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long apiQuoteId;
	private String text;
	private String author;
	private String tag;

}
