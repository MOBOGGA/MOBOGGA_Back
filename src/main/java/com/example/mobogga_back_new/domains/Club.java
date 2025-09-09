package com.example.mobogga_back_new.domains;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Club {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private long userId;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String poster;
    private String name;
    private String instaUrl;
    private String kakaoUrl;
    private String youtubeUrl;
    private String notionUrl;
    private String url;
    private int mandatorySemesters;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    private String category;

    @OneToMany(mappedBy = "club")
    private List<ShowTable> shows = new ArrayList<>();

    @OneToMany(mappedBy = "club")
    private List<Entertain> entertains = new ArrayList<>();

    @OneToMany(mappedBy = "club")
    private List<Recruiting> recruitings = new ArrayList<>();
}
