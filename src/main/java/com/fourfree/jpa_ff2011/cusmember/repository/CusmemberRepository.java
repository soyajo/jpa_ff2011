package com.fourfree.jpa_ff2011.cusmember.repository;

import com.fourfree.jpa_ff2011.cusmember.Cusmember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CusmemberRepository extends JpaRepository<Cusmember, String> {

}
