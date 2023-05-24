package com.example.demo.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DEMO")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Gmail")
    private String Gmail;
    @Column(name = "F_name")
    private  String F_name;
    @Column(name = "L_name")
    private String L_name;
    @Column(name = "P_honNo")
    private int P_honNo;
}
