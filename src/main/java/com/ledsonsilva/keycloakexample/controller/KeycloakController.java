package com.ledsonsilva.keycloakexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.Map;

@RestController
@RequestMapping("/v1/keycloak-example")
public class KeycloakController {
    @GetMapping
    @RolesAllowed({"user", "admin"})
    public ResponseEntity<Object> getUserEndpoint() {
        Object response = Map.of("endpoint", "user", "role", "spring-user");
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "admin")
    @RolesAllowed("admin")
    public ResponseEntity<Object> getAdminEndpoint() {
        Object response = Map.of("endpoint", "admin "   , "role", "spring-admin");
        return ResponseEntity.ok(response);
    }
}
