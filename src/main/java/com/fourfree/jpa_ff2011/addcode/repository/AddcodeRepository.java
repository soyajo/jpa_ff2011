package com.fourfree.jpa_ff2011.addcode.repository;

import com.fourfree.jpa_ff2011.addcode.entity.Addcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddcodeRepository extends JpaRepository<Addcode, String> {

}
