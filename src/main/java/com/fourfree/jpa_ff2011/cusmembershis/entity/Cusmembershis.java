package com.fourfree.jpa_ff2011.cusmembershis.entity;

import com.fourfree.jpa_ff2011.cusmember.entity.Cusmember;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "CUSMEMBERSHIS")
public class Cusmembershis {

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

//    public void setCusmember(Cusmember cusmember) {
//        this.cusmember = cusmember;
//    }

    // 연관관계 편의 메서드
    // 둘 중의 하나 지우기
//    public void changeCusmember(Cusmember cusmember) {
//        this.cusmember = cusmember;
//        cusmember.getCusmembershisList().add(this);
//    }


}
