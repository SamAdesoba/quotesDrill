package com.grouptwo.quotesdrill.data.repositories;

import com.grouptwo.quotesdrill.data.model.ApiQuotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiQuotesRepository extends JpaRepository<ApiQuotes, Long> {

}
