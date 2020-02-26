package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.Usercl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Usercl, Integer> {

}
