package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Data valid;

    @ManyToOne // Um Evento pode pertencer a diversos Cupons, enquanto um Cupom pertence a apenas um Evento
    @JoinColumn(name = "event_id")
    private Event event;
}
