package com.smartSure.claimService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartSure.claimService.entity.*;
@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{
	List<Claim> findByStatus(Status status);
}
