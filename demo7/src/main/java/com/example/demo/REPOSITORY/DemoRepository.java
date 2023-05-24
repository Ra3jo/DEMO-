package com.example.demo.REPOSITORY;

import com.example.demo.ENTITY.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo,Long> {
}
