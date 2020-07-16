 
package com.thinkmicroservices.ri.spring.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author cwoodward
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.cloud.config.enabled=false")

public class SmokeTest {
 

    /**
     * 
     * @throws Exception 
     */
    @Test
    public void contextLoads() throws Exception {
       
    }
}
