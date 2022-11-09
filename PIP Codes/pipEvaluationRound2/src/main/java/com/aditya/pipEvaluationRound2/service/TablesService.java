package com.aditya.pipEvaluationRound2.service;

import com.aditya.pipEvaluationRound2.dto.requestDto.TableBookingDto;
import org.springframework.http.ResponseEntity;

public interface TablesService {
    public ResponseEntity addTables();
    public ResponseEntity getTables();
    public ResponseEntity bookTables(TableBookingDto tableBookingDto);
}
