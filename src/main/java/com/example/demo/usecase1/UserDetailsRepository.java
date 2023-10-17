package com.example.demo.usecase1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 868065
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
}
