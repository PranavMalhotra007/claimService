package com.smartSure.claimService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Request DTO for creating a claim.
 * Only policyId is needed — status, timeOfCreation are set automatically
 * by @PrePersist, and amount is fetched from PolicyDTO via OpenFeign.
 */
@Getter
@Setter
@NoArgsConstructor
public class ClaimRequest {
    private Long policyId;
}