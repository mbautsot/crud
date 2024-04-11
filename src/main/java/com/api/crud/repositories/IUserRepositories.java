package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUserRepositories extends JpaRepository<UserModel,Long> {

}
