package com.smartSure.claimService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartSure.claimService.entity.*;

public interface ClaimRepository extends JpaRepository<Claim, Long>{
	List<Claim> findByStatus(Status status);
}
