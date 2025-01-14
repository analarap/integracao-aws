package com.eventostec.api.dto.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

//
public record EventRequestDto(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
