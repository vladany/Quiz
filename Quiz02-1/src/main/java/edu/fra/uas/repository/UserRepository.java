package edu.fra.uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fra.uas.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
