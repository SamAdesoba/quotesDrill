package com.grouptwo.quotesdrill.data.repositories;

import com.grouptwo.quotesdrill.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
