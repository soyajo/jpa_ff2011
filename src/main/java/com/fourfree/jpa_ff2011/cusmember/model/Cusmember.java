package com.fourfree.jpa_ff2011.cusmember.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "CUSMEMBER")
public class Cusmember {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "GUBUN1")
    private String gubun1;

    @Column(name = "GUBUN2")
    private String gubun2;

    @Column(name = "GUBUN3")
    private String gubun3;

    @Column(name = "CNAME")
    private String cname;

    @Column(name = "TEL1")
    private String tel1;

    @Column(name = "TEL2")
    private String tel2;

    @Column(name = "PAUSEYN")
    private String pauseyn;

    @Column(name = "PAUSEDATE")
    private String pausedate;

    @Column(name = "PAYWAY")
    private String payway;

    @Column(name = "CDATE")
    private String cdate;

    @Column(name = "INTIME")
    private String intime;

    @Column(name = "UDATE")
    private String udate;

    @Column(name = "MODIDATE")
    private String modidate;

    @Column(name = "MODIPROTY")
    private String modiproty;

    @Column(name = "CPYN")
    private String cpyn;

    @Column(name = "TMYN")
    private String tmyn;

    @Column(name = "AREACODE")
    private String areacode;

    @Column(name = "AREACODEZ")
    private String areacodez;

    @Column(name = "MGR1CODE")
    private String mgr1code;

    @Column(name = "MGR1PART")
    private String mgr1part;

    @Column(name = "BIGO")
    private String bigo;

    @Column(name = "CALLBOUNDSTATUS")
    private String callboundstatus;

    @Column(name = "CALLBOUNDCINFO")
    private String callboundcinfo;

    @Column(name = "MEMBERCLASS")
    private String memberclass;

    @Column(name = "MGR2CODE")
    private String mgr2code;

    @Column(name = "MGR2PART")
    private String mgr2part;

    @Column(name = "BIGO1")
    private String bigo1;

    @Column(name = "MGR1GUBUN")
    private String mgr1gubun;

    @Column(name = "MGR1DATE")
    private String mgr1date;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "AGE")
    private String age;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "MGR3CODE")
    private String mgr3code;

    @Column(name = "MGR3PART")
    private String mgr3part;

    @Column(name = "SMSYN")
    private String smsyn;

    @Column(name = "MOBILEYN")
    private String mobileyn;

    @Column(name = "ZIRO_PAYBYPROXY_YN")
    private String ziroPaybyproxyYn;

    @Column(name = "DISCOUNT_YN")
    private String discountYn;

    @Column(name = "TEL_DELIVERY")
    private String telDelivery;

}
