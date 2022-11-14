package com.aditya.interview3Level.model.dto.requestDto;

import lombok.Data;

@Data
public class PlayerAttackDto {
    int gameId;
    int player;
    int x;
    int y;
}
