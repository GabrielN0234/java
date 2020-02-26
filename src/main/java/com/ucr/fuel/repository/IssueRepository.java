package com.ucr.fuel.repository;

import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.domain.business.Issuecl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IssueRepository extends JpaRepository<Issuecl, Integer> {

}
