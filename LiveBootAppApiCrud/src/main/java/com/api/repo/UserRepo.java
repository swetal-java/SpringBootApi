package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{

}
