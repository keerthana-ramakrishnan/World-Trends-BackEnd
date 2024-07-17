package com.WorldTrends.controller;

import java.util.List;

import com.WorldTrends.Model.WorldTrends;
import com.WorldTrends.service.WorldTrendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from localhost:3000
@RequestMapping("/api/trends")
public class WorldTrendsController {


    @Autowired
    private WorldTrendsService trendService;

    @GetMapping
    public List<WorldTrends> getAllTrends() {
        return trendService.getAllTrends();
    }

    @GetMapping("/{id}")
    public WorldTrends getTrendById(@PathVariable String id) {
        return trendService.getTrendById(id);
    }

    @GetMapping("/orphans")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<WorldTrends> getOrphanTrends() {
        return trendService.getOrphanTrends();
    }
}
