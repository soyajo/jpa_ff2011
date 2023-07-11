package com.fourfree.jpa_ff2011.cusmember.dto;

import com.fourfree.jpa_ff2011.cusmembershis.dto.CusmembershisDto;
import com.fourfree.jpa_ff2011.cusmembershis.entity.Cusmembershis;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CusmemberDto {
    private String code;
    private String gubun1;
    private String gubun2;
    private String gubun3;
    private String cname;
    private String tel1;
    private String tel2;
    private String pauseyn;
    private String pausedate;
    private String payway;
    private String cdate;
    private String intime;
    private String udate;
    private LocalDateTime modidate;
    private String modiproty;
    private String cpyn;
    private String tmyn;
    private String areacode;
    private String areacodez;
    private String mgr1code;
    private String mgr1part;
    private String bigo;
    private String callboundstatus;
    private String callboundcinfo;
    private String memberclass;
    private String mgr2code;
    private String mgr2part;
    private String bigo1;
    private String mgr1gubun;
    private String mgr1date;
    private String birthday;
    private Integer age;
    private String sex;
    private String mgr3code;
    private String mgr3part;
    private String smsyn;
    private String mobileyn;
    private String ziroPaybyproxyYn;
    private String discountYn;
    private String telDelivery;
    private List<CusmembershisDto> cusmembershisList = new ArrayList<>();
}
