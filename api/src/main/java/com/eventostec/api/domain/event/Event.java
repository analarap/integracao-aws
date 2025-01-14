package com.eventostec.api.domain.event;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
