package com.example.demo.CONTOLLER;

import com.example.demo.ENTITY.Demo;
import com.example.demo.SERVICE.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/DEMO")
public class DemoController {
    private DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
    //create RestCont5roller
    @PostMapping
    public ResponseEntity<Demo>createDemo(@RequestBody Demo demo){
        return new ResponseEntity<>(demoService.createDemo(demo), HttpStatus.CREATED);
    }
    // get all impl
    @GetMapping
    public List<Demo>getAllDemo(){
        return demoService.getAll();
    }
      // get Impl By Id
    @GetMapping("{id}")
    public ResponseEntity<Demo>getDemoById(@PathVariable Long id){
        return new ResponseEntity<>(demoService.getDemoById(id),HttpStatus.OK);
    }
    //update impl by id
   @PutMapping("{id}")
   public ResponseEntity<Demo>updateDemo(@PathVariable Long id,@RequestBody Demo demo){
        return new ResponseEntity<>(demoService.updateDemo(id,demo),HttpStatus.OK);
   }
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteDemo(@PathVariable Long id){
        demoService.deleteDemo(id);
        return new ResponseEntity<>("DeletedSuccessfully",HttpStatus.OK);
    }
}
