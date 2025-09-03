package com.micro.MicroCreditos.repository.impl;

import com.micro.MicroCreditos.repository.MicroRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class MicroRepositoryImpl implements MicroRepository {

    //@Autowired
    //private JdbcTemplate jdbcTemplate;


   @Override
    public List<Map<String, Object>> getMicroCreditContract() {
        String query = "SELECT G_CONTRACT_ID, GF_LOCAL_CONTRACT_NUMBER_ID, GF_PRODUCT_OFFER_ID, GF_CONTRACT_DATE, GF_EFFECTIVE_END_DATE, G_MCRCR_CONTRACT_STATUS_TYPE, GF_CONTRACT_STATUS_DATE FROM DATAM.T_KMIC_MICROCREDIT_CONTRACT";
        //return jdbcTemplate.queryForList(query);
        return new ArrayList<>();
    }
}
