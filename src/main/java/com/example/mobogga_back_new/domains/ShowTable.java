package com.example.mobogga_back_new.domains;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ShowTable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String poster;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String introductionLetter;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String noticeLetter;

    private String location;
    private String accountBankName;
    private String accountName; //예금주 이름
    private String accountNumber;
    private String category;
    private int runtime;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate postDate;
    private String qrImg;
    private Boolean earlyBird;
    private String manager; // 문의이름
    private String managerPhoneNumber;
    private String instaUrl;
    private String kakaoUrl;
    private String youtubeUrl;
    private String notionUrl;
    private String url;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules = new ArrayList<>();


//    public static ShowTable from(ShowEditRequest request) {
//
//        return ShowTable.builder()
//                .name(request.getName())
//                .introductionLetter(request.getIntroductionLetter())
//                .location(request.getLocation())
//                .runtime(request.getRuntime())
//                .startDate(request.getStartDate())
//                .endDate(request.getEndDate())
//                .accountNumber(request.getAccountNumber())
//                .accountBankName(request.getAccountBankName())
//                .accountName(request.getAccountName())
//                .qrImg(request.getQrPhoto())
//                .build();
//
//    }
}

