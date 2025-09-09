package com.example.mobogga_back_new.domains;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int orderIndex;
    private LocalDate date;
    private LocalTime time;
    private int cost;
    private int maxPeople;
    private int applyPeople;
    private int maxTickets;


    @ManyToOne
    @JoinColumn(name = "show_id")
    private ShowTable show;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations = new ArrayList<>();


//    public static Schedule from(ScheduleEditDto scheduleEditDto) {
//        return Schedule.builder()
//                .orderIndex(scheduleEditDto.getOrderIndex())
//                .date(scheduleEditDto.getDate())
//                .time(scheduleEditDto.getTime())
//                .cost(scheduleEditDto.getCost())
//                .maxTickets(scheduleEditDto.getMaxTicket())
//                .build();
//    }
}

