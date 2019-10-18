package com.jpa.quickjpa.repositories;

import com.jpa.quickjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
