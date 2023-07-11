package com.fourfree.jpa_ff2011.cusmembershis.controller;

import com.fourfree.jpa_ff2011.cusmembershis.entity.Cusmembershis;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cusmembershis")
@Transactional
public class CusmembershisController {

    private final EntityManager em;


    @Transactional(readOnly = true)
    @GetMapping("/{code}")
    public String get(
            Model model,
            @PathVariable("code") String code
    ) {

        String query1 = "select cs from Cusmembershis cs where cs.code = :code";
        List<Cusmembershis> cusmembershisList = em.createQuery(query1, Cusmembershis.class)
                .setParameter("code", code)
                .getResultList();


        model.addAttribute("cusmembershisList", cusmembershisList);

        return "cusmembershis/get";
    }
}
