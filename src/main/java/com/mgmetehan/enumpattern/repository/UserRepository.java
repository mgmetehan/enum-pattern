package com.mgmetehan.enumpattern.repository;

import com.mgmetehan.enumpattern.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
