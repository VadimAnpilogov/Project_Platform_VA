package com.Platform_VA.Main_Interface.Repository;

import com.Platform_VA.Main_Interface.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Long> {
    Users findByUsername(String username);

}