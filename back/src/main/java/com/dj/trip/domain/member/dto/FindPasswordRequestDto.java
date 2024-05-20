package com.dj.trip.domain.member.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindPasswordRequestDto {
    private String memberId;
    private String email;
}
