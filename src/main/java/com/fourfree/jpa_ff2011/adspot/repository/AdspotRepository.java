package com.fourfree.jpa_ff2011.adspot.repository;

import com.fourfree.jpa_ff2011.adspot.entity.Adspot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdspotRepository extends JpaRepository<Adspot, String> {

}
