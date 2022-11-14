package com.aditya.interview3Level.model.dto.requestDto;

import lombok.Data;

@Data
public class MovePlayerDto {
    int gameId;
    int player;
    int x;
    int y;
}
