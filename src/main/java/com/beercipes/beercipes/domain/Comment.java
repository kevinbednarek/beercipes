package com.beercipes.beercipes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    private Integer ratingTotal;
    private Integer ratingCount;
    private Float ratingAverage;
    private Boolean madeIt;
}
