package com.devops.backend.persistence.Repository;

import org.springframework.data.repository.CrudRepository;
import com.devops.backend.persistence.domain.backend.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by marciodasilva on 10/15/16.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
