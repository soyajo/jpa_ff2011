package com.fourfree.jpa_ff2011.cusmembershis.repository;

import com.fourfree.jpa_ff2011.cusmembershis.entity.Cusmembershis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CusmembershisRepository extends JpaRepository<Cusmembershis, String> {


}
