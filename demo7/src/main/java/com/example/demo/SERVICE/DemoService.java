package com.example.demo.SERVICE;

import com.example.demo.ENTITY.Demo;

import java.util.List;

public interface DemoService {
    // create
    Demo createDemo(Demo demo);
     // get all
    List<Demo>getAll();
    // get By Id
    Demo getDemoById(Long id);
    // update demo
    Demo updateDemo(Long id,Demo demo);
    void deleteDemo(Long id);
}
