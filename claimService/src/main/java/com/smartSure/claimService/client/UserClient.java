package com.smartSure.claimService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smartSure.claimService.dto.UserDTO;

@FeignClient(name = "AUTHSERVICE", path = "/api/user")
public interface UserClient {
 
    @GetMapping("/{userId}")
    UserDTO getUserById(@PathVariable("userId") Long userId);
}
 