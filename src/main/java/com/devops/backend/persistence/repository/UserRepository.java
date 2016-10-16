package com.devops.backend.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import com.devops.backend.persistence.domain.backend.User;
import org.springframework.stereotype.Repository;

/**
 * Created by marciodasilva on 10/15/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Returns a User given a username or null if not found.
     * @param username The username
     * @return a User given a username or null if not found.
     */
    public User findByUsername(String username);

}
