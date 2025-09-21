package org.example.bilibili.api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Demo API Controller
 * 
 * This controller provides demonstration endpoints for the Bilibili microservices architecture.
 * It showcases simple CRUD operations, circuit breaker testing, and inter-service communication patterns.
 * 
 */
@RestController
public class DemoApi {

    /**
     * GET endpoint for retrieving demo data by ID
     * Simple demonstration of a read operation
     * 
     * @param id The ID of the demo data to retrieve
     * @return The ID value (echoed back for demonstration)
     */
    @GetMapping("/demos")
    public Long msget(@RequestParam Long id) {
        return id;
    }

    /**
     * POST endpoint for creating/updating demo data
     * Demonstrates request body handling and data echoing
     * 
     * @param params Map of parameters sent in the request body
     * @return The same parameters (echoed back for demonstration)
     */
    @PostMapping("/demos")
    public Map<String, Object> mspost(@RequestBody Map<String, Object> params) {
        return params;
    }

    /**
     * GET endpoint for testing circuit breaker patterns
     * Simulates a slow service by sleeping for the specified time
     * Used for testing timeout handling and circuit breaker functionality
     * 
     * @param time The time in milliseconds to sleep (simulate processing time)
     * @return A test message indicating circuit breaker testing
     */
    @GetMapping("/timeout")
    public String timeout(@RequestParam Long time) {
        try {
            Thread.sleep(time);  // Simulate slow service response
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "circuit breaker testing";
    }

}