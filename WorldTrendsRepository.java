package com.WorldTrends.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.WorldTrends.Model.WorldTrends;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldTrendsRepository extends MongoRepository<WorldTrends, String> {
    List<WorldTrends> findByOrphan(boolean orphan);

}
