/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.UserReply;
import com.helpmobile.rest.mapper.RestObjectMapper;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terra
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test() throws IOException{
        ObjectMapper mapper = new RestObjectMapper();
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        
        RestAccess rest = new RestAccess();
        
        
        User result = rest.retriveId("12345");
        String json = mapper.writeValueAsString(result);
        
        System.out.println(json);
        //UserReply user = mapper.readValue(result, UserReply.class);
        
    }
}
