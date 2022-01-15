package com.example.jsonviewexample.cach;

import lombok.Data;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;

@Data
@Entity
@Table(name="city")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class City  {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "name")
    private String name;

    @Column(name="population")
    private Long population;
}
