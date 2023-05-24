package com.example.demo;

import com.example.demo.ENTITY.Demo;
import com.example.demo.REPOSITORY.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo7Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo7Application.class, args);
    }
    @Autowired
    private DemoRepository demoRepository;

    @Override
    public void run(String... args) throws Exception {
        Demo demo=new Demo();
        demo.setGmail("wwwrbej@gmail.com");
        demo.setF_name("DEO");
        demo.setL_name("DUA");
        demo.setP_honNo(765432234);
        demoRepository.save(demo);


        Demo demo1=new Demo();
        demo1.setGmail("www.rbr@gmail.com");
        demo1.setF_name("EO");
        demo1.setL_name("UA");
        demo1.setP_honNo(765432234);
        demoRepository.save(demo1);



    }
}
