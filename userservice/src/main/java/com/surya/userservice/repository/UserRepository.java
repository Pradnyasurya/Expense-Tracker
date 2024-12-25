package com.surya.userservice.repository;

import com.surya.userservice.entities.UserInfoDto;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<UserInfoDto, String>
{

    Optional<UserInfoDto> findByUserId(String userId);

}
