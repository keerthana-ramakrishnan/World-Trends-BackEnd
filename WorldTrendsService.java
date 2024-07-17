package com.WorldTrends.service;


import com.WorldTrends.Model.WorldTrends;
import com.WorldTrends.repository.WorldTrendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldTrendsService {
    @Autowired
    private WorldTrendsRepository trendRepository;

    public List<WorldTrends> getAllTrends() {
        return trendRepository.findAll();
    }

    public WorldTrends getTrendById(String id) {
        return trendRepository.findById(id).orElse(null);
    }

    public List<WorldTrends> getOrphanTrends() {
        // Define your logic here to fetch orphan trends
        // For example, assuming you have a method in repository to find orphan trends
        return trendRepository.findByOrphan(true); // Adjust according to your actual entity structure
    }

}
