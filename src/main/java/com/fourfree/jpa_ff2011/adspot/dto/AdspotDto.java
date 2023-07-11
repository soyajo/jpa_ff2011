package com.fourfree.jpa_ff2011.adspot.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AdspotDto {

    private String scode;
    private String icode;
    private String dosage;
    private String udate;
    private String username;
    private String utime;
}
