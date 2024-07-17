package com.WorldTrends.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WorldTrends")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldTrends {
    @Id
    private String id;
    private int endYear;
    private boolean orphan;
    private Double intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private int startYear;
    private Double impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private Double relevance;
    private String pestle;
    private String source;
    private String title;
    private Double likelihood;


}
