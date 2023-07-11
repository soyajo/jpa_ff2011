package com.fourfree.jpa_ff2011.adspot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Adspot {

    @Id
    @Column(name = "SCODE")
    private String scode;
    @Column(name = "ICODE")
    private String icode;
    @Column(name = "DOSAGE")
    private Integer dosage;
    @Column(name = "UDATE")
    private String udate;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "UTIME")
    private String utime;
}
