package com.example.demo.SERVICE;

import com.example.demo.ENTITY.Demo;
import com.example.demo.EXCEPTION.ResourceNotFoundException;
import com.example.demo.REPOSITORY.DemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DemoServiceImpl implements DemoService {
    private DemoRepository demoRepository;

    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
      // create Impl Interface

    @Override
    public Demo createDemo(Demo demo) {
        return demoRepository.save(demo);
    }
 // get all interfaceImpl
    @Override
    public List<Demo> getAll() {
        return demoRepository.findAll();
    }
 // get service interface By Id
    @Override
    public Demo getDemoById(Long id) {
        Demo demo=demoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("ResourceNotFound"));
        return demo;
    }
 // updateDemoServiceInterface impl
    @Override
    public Demo updateDemo(Long id, Demo demo) {
        Demo existingDemo=demoRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("NotFound"));
        demo.setGmail(demo.getGmail());
        demo.setF_name(demo.getF_name());
        demo.setL_name(demo.getL_name());
        demo.setP_honNo(demo.getP_honNo());
        Demo updateDemo=demoRepository.save(existingDemo);
        return updateDemo;
    }

    @Override
    public void deleteDemo(Long id) {
       Demo deleteDemo=demoRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("NotFound"));
        demoRepository.delete(deleteDemo);
    }
}