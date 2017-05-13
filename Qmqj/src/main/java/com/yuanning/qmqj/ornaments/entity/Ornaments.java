package com.yuanning.qmqj.ornaments.entity;

import lombok.Data;

@Data
public class Ornaments {
    private Integer id;

    private String name;

    private String nameReplace;

    private Integer attack;

    private Integer defense;

    private Integer life;

    private Double lifePerc;

    private Double damagePerc;

    private Double elementPerc;

    private Double excellentPerc;

    private Double excellentProb;

    private Double doubProb;

    private Integer rebound;

    private Integer additional;

    private Integer resist;

    private Integer attackRecovery;

    private Double attackRecoveryPerc;

    private Double resistDouble;

    private Double resistExcellent;

    private Double resistLucky;

    private Double medicineRecovery;

    private Double holyRecovery;

    private Double lifeRecovery;

    private Double elementReduce;

    
}