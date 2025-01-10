package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date valid;

    @ManyToOne // Um Evento pode pertencer a diversos Cupons, enquanto um Cupom pertence a apenas um Evento
    @JoinColumn(name = "event_id")
    private Event event;
}
