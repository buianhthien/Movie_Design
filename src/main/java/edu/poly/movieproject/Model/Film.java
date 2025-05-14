package edu.poly.movieproject.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "films")
@AllArgsConstructor
@NoArgsConstructor

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String name;
    private String image;
    private String description;
    private String trailer;
    private String category;
    private String actor;
    private String director;
    private String country;
    private String time;
    private String releaseDate;
    private int viewCount;
    private int ratingCount;
    private double ratingScore;
}
