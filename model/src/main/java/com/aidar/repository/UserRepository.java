package com.aidar.repository;

import com.aidar.enums.Role;
import com.aidar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByRole(Role role);

    User findOneByEmail(String email);

}
