package com.rishuDev.ecommerce.repository;

import com.rishuDev.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
