package com.devops.backend.persistence.Repository;

import org.springframework.data.repository.CrudRepository;
import com.devops.backend.persistence.domain.backend.User;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

/**
 * Created by marciodasilva on 10/15/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
