package com.grouptwo.quotesdrill.data.repositories;

import com.grouptwo.quotesdrill.data.model.UserQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserQuotesRepository extends JpaRepository<UserQuote, Long> {

    List<UserQuote> findUserQuoteByIdBetween(long since, long until);
}