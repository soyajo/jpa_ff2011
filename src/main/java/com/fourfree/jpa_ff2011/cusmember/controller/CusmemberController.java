package com.fourfree.jpa_ff2011.cusmember.controller;

import com.fourfree.jpa_ff2011.cusmember.model.Cusmember;
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
@RequestMapping("/cusmember")
@RequiredArgsConstructor
public class CusmemberController {

    private final EntityManager em;

    @GetMapping("/{cname}")
    @Transactional(readOnly = true)
    public String get(
            Model model,
            @PathVariable("cname")String cname
    ) {

        cname = "조소야";
        String query = "select c from Cusmember c where c.cname = :cname";
        List<Cusmember> cusmembers = em.createQuery(query , Cusmember.class)
                .setParameter("cname", cname)
                .getResultList();

        model.addAttribute("cusmembers", cusmembers);

        return "cusmember/get";
    }

}
