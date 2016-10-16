package com.devops.backend.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import com.devops.backend.persistence.domain.backend.Plan;
import org.springframework.stereotype.Repository;


/**
 * Created by marciodasilva on 10/15/16.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
