package com.example.mobogga_back_new.domains;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recruiting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String poster;

    private String field; // TODO : 삭제하기 - 안 쓰는 필드
    private LocalDate startDate;
    private LocalDate endDate;
    private int mandatorySemesters;
    private String meetingTime; //정모시간
    private String eligibility;
    private String interviewDate; // TODO : 삭제하기 - 안 쓰는 필드
    private String location; // TODO : 삭제하기 - 안 쓰는 필드

    @Lob
    @Column(columnDefinition = "TEXT")
    private String notice;
    private String category;

    private String manager; // 문의이름
    private String managerPhoneNumber;
    private String introductionLetter;
    private String instaUrl;
    private String kakaoUrl;
    private String youtubeUrl;
    private String notionUrl;
    private String url;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    String applicationUrl;
    private LocalDate postDate;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;


//    public static Recruiting from(RecruitingEditRequest request) {
//
//        return Recruiting.builder()
//                .name(request.getName())
//                .field(request.getCategory())
//                .startDate(request.getStartDate())
//                .endDate(request.getEndDate())
//                .mandatorySemesters(request.getMandatorySemesters())
//                .content(request.getContent())
//                .eligibility(request.getEligibility())
//                .notice(request.getNotice())
//                .manager(request.getManager())
//                .managerPhoneNumber(request.getManagerPhoneNumber())
//                .instaUrl(request.getInUrl())
//                .kakaoUrl(request.getKakaUrl())
//                .youtubeUrl(request.getYouUrl())
//                .notionUrl(request.getNoUrl())
//                .url(request.getUrl())
//                .build();
//    }
}