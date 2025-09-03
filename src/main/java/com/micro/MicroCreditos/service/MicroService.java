package com.micro.MicroCreditos.service;

import com.micro.MicroCreditos.repository.MicroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MicroService {
   // @Autowired
    //MicroRepository microRepository;

    @GetMapping
    public List<Map<String, Object>> getMicroCreditContract() {

        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();

        map.put("acount", 1234);

        list.add(map);

                //microRepository.getMicroCreditContract();


        return list;
    }

}
