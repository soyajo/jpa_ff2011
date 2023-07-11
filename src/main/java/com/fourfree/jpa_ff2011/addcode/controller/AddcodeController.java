package com.fourfree.jpa_ff2011.addcode.controller;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addcode")
@RequiredArgsConstructor
public class AddcodeController {

    private final EntityManager em;


}
