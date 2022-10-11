package com.grouptwo.quotesdrill.data.repositories;

import com.grouptwo.quotesdrill.data.model.UserQuote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuotesRepository extends JpaRepository<UserQuote, Long> {

}
