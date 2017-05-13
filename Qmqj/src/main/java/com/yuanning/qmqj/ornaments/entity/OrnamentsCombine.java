package com.yuanning.qmqj.ornaments.entity;

import lombok.Data;

@Data
public class OrnamentsCombine {
    private Integer id;

    private String combineName;

    private Double lifePerc;

    private Double damagePerc;

    private Double elementPerc;

    private Double excellentPerc;

    private Double excellentProb;

    private Double doubProb;

    private Double attackRecoveryPerc;

    private Double resistDouble;

    private Double resistExcellent;

    private Double resistLucky;

    private Double medicineRecovery;

    private Double holyRecovery;

    private Double lifeRecovery;

    private Double elementReduce;

    private Double magicImmune;

    private Double physicsImmune;

    private Double avoid;

    private Double magPhyReduce;

    private Double specialReduce;
}