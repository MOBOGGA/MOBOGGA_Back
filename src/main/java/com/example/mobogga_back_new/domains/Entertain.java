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
public class Entertain {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String poster;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String introductionLetter;

    private String location;
    private String category;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String etcInfo;

    private LocalDate startDate;
    private LocalDate endDate;
    private String timeList;
    private LocalDate postDate;

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

//    public static Entertain from(EntertainEditRequest editRequest) {
//
//        return Entertain.builder()
//                .name(editRequest.getName())
//                .introductionLetter(editRequest.getIntroductionLetter())
//                .location(editRequest.getLocation())
//                .startDate(editRequest.getStartDate())
//                .endDate(editRequest.getEndDate())
//                .timeList(editRequest.getTimeList())
//                .manager(editRequest.getManager())
//                .managerPhoneNumber(editRequest.getManagerPhoneNumber())
//                .instaUrl(editRequest.getInUrl())
//                .kakaoUrl(editRequest.getKakaUrl())
//                .youtubeUrl(editRequest.getYouUrl())
//                .notionUrl(editRequest.getNoUrl())
//                .url(editRequest.getUrl())
//                .build();
//    }
}
