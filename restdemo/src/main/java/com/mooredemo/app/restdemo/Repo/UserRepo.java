package com.mooredemo.app.restdemo.Repo;

import com.mooredemo.app.restdemo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
