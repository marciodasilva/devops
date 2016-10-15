package com.devops.test.integration;

import com.devops.DevopsApplication;
import com.devops.backend.persistence.Repository.PlanRepository;
import com.devops.backend.persistence.Repository.RoleRepository;
import com.devops.backend.persistence.Repository.UserRepository;
import com.devops.backend.persistence.domain.backend.Plan;
import com.devops.backend.persistence.domain.backend.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by marciodasilva on 10/15/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DevopsApplication.class)
public class RepositoryIntegrationTest {


    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

   @Autowired
   private UserRepository userRepository;

    private static final int BASIC_PLAN_ID = 1;
    private static final int BASIC_ROLE_ID = 1 ;

    @Before
    public void init(){

        Assert.assertNotNull(planRepository);
     //   Assert.assertNotNull(roleRepository);
     //   Assert.assertNotNull(userRepository);
    }

    @Test
    public void testCreateNewPlan() throws Exception {
        Plan basicPlan = createBasicPlan();
        planRepository.save(basicPlan);
        Plan retrivedPlan = planRepository.findOne(BASIC_PLAN_ID);
        Assert.assertNotNull(retrivedPlan);
    }
    @Test
    public void testCreatedNewRole() throws Exception {
        Role basicRole = createBasicRole();
        roleRepository.save(basicRole);
        Role retrivedRole = roleRepository.findOne(BASIC_ROLE_ID);
        Assert.assertNotNull(retrivedRole);
    }
    private Plan createBasicPlan(){
        Plan plan = new Plan();
        plan.setId(BASIC_PLAN_ID);
        plan.setName("Basic");
        return plan;
    }

    private Role createBasicRole(){
        Role role = new Role();
        role.setId(BASIC_ROLE_ID);
        role.setName("ROLE_USER");
        return role;

    }
}
