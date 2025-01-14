package com.eventostec.api.dto.coupon;

public record CouponRequestDto(String code, Integer discount, Long valid) {
}
