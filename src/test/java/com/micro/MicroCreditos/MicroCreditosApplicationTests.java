package com.micro.MicroCreditos;

import com.micro.MicroCreditos.controller.MicroController;
import com.micro.MicroCreditos.repository.MicroRepository;
import com.micro.MicroCreditos.service.MicroService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@SpringBootTest
class MicroCreditosApplicationTests {


    @Mock
    MicroController microController;


    @Mock
    MicroService microService;


    @Mock
    MicroRepository microRepository;

    //@Mock
   // private JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {

       //when(jdbcTemplate.queryForList(Mockito.eq("query"))).thenReturn(getMicroCredit());

        microController.getMicroCreditContract();
        microService.getMicroCreditContract();
        microRepository.getMicroCreditContract();


    }

    public List<Map<String, Object>> getMicroCredit(){
        return Collections.emptyList();
    }

}
