package com.grouptwo.quotesdrill.data.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Api Quotes")
@Entity
public class ApiQuotes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long apiQuoteId;
	private String quote;
	private String Author;

}
