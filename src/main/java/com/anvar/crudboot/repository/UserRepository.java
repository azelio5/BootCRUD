package com.anvar.crudboot.repository;

import com.anvar.crudboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
