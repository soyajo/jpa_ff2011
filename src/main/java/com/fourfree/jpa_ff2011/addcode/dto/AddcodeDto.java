package com.fourfree.jpa_ff2011.addcode.dto;

import com.fourfree.jpa_ff2011.cusmembershis.dto.CusmembershisDto;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AddcodeDto {

    private String code;
    private String jcode;
    private String pfrom;
    private String pto;
    private String gubun;
    private String spname;
    private String sdate;
    private String payway;
    private String pauseyn;
    private String pausedate;
    private String pausecause;
    private String regproty;
    private String delyn;
    private String delproty;
    private String bigo;
    private LocalDateTime udate;
    private String uproty;
    private String ubigo;
    private String uhistory;
    private String recommender;
    private String salegubun;
    private String stime;
    private LocalDateTime idate;
    private LocalDateTime mdate;
}
