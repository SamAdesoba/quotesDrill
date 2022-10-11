package com.grouptwo.quotesdrill.data.repositories;

import com.grouptwo.quotesdrill.data.model.UserQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuoteRepository extends JpaRepository<UserQuote, Long> {
}
