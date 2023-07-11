package com.fourfree.jpa_ff2011.adspot.controller;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adspot")
@RequiredArgsConstructor
public class AdspotController {

    private final EntityManager em;


}
