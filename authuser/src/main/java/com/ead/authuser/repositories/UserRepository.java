package com.ead.authuser.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.authuser.models.userModel;

public interface UserRepository extends JpaRepository<userModel, UUID> {

}
