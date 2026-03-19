package com.smartSure.claimService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smartSure.claimService.dto.PolicyDTO;

@FeignClient(name = "POLICYSERVICE", path = "/api/policies")
public interface PolicyClient {
 
    @GetMapping("/{policyId}")
    PolicyDTO getPolicyById(@PathVariable("policyId") Long policyId);
}