package com.fourfree.jpa_ff2011.addcode.entity;

import com.fourfree.jpa_ff2011.cusmember.entity.Cusmember;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Addcode {

    @Id
    @Column(name = "CODE")
    private String code;
    @Column(name = "JCODE")
    private String jcode;
    @Column(name = "PFROM")
    private String pfrom;
    @Column(name = "PTO")
    private String pto;
    @Column(name = "GUBUN")
    private String gubun;
    @Column(name = "SPNAME")
    private String spname;
    @Column(name = "SDATE")
    private String sdate;
    @Column(name = "PAYWAY")
    private String payway;
    @Column(name = "PAUSEYN")
    private String pauseyn;
    @Column(name = "PAUSEDATE")
    private String pausedate;
    @Column(name = "PAUSECAUSE")
    private String pausecause;
    @Column(name = "REGPROTY")
    private String regproty;
    @Column(name = "DELYN")
    private String delyn;
    @Column(name = "DELPROTY")
    private String delproty;
    @Column(name = "BIGO")
    private String bigo;
    @Column(name = "UDATE")
    private LocalDateTime udate;
    @Column(name = "UPROTY")
    private String uproty;
    @Column(name = "UBIGO")
    private String ubigo;
    @Column(name = "UHISTORY")
    private String uhistory;
    @Column(name = "RECOMMENDER")
    private String recommender;
    @Column(name = "SALEGUBUN")
    private String salegubun;
    @Column(name = "STIME")
    private String stime;
    @CreationTimestamp
    @Column(name = "IDATE")
    private LocalDateTime idate;
    @UpdateTimestamp
    @Column(name = "MDATE")
    private LocalDateTime mdate;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "CODE", referencedColumnName = "CODE")
    private Cusmember cusmember;
}
