package com.eventostec.api.controllers;

import com.eventostec.api.domain.event.Event;
import com.eventostec.api.dto.event.EventRequestDto;
import com.eventostec.api.services.EventService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<Event> createEvent(@RequestParam("title") @NotBlank String title,
                                             @RequestParam(value = "description", required = false) String description,
                                             @RequestParam("date") Long date,
                                             @RequestParam("city") String city,
                                             @RequestParam("uf") String uf,
                                             @RequestParam("remote") Boolean remote,
                                             @RequestParam("eventUrl") String eventUrl,
                                             @RequestParam(value = "image", required = false) MultipartFile image) {
        EventRequestDto eventRequestDto = new EventRequestDto(title, description, date, city, uf, remote, eventUrl, image);
        Event newEvent = this.eventService.createEvent(eventRequestDto);
        return ResponseEntity.ok(newEvent);
    }
}
