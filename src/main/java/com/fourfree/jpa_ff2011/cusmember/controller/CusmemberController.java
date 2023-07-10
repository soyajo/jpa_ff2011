package com.fourfree.jpa_ff2011.cusmember.controller;

import com.fourfree.jpa_ff2011.cusmember.Cusmember;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cusmember")
@RequiredArgsConstructor
public class CusmemberController {

    private final EntityManager em;

    @GetMapping
    public String get(Model model) {

        String cname = "조소야";
        String query = "select c from Cusmember c where c.cname = :cname";
        List<Cusmember> cusmembers = em.createQuery(query , Cusmember.class)
                .setParameter("cname", cname)
                .getResultList();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }

        model.addAttribute("cusmembers", cusmembers);

        return "cusmember/get";
    }

}
