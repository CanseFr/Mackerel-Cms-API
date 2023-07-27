package com.mackerel.canse.entity.home;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message;
    private String auteur;
    private String titre;
    @OneToMany
    private List<HomeArticle> articleList;
    @OneToMany
    private List<HomeSectionBottom> homeSectionBottoms;





}
